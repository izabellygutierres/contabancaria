package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection (numero);	
		if (conta !=null)
			conta.visualizar();
		else
			System.out.println("\nA Conta número: " + numero + " não foi encontrada!");
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta número: "+ conta.getNumero()+ " foi criada com sucesso! ");
		
	}

	@Override
	public void atualizar(Conta conta) {
		var buscarConta = buscarNaCollection(conta.getNumero());
		
		if (buscarConta !=null) {
			listaContas.set(listaContas.indexOf(buscarConta), conta);
			System.out.println("\nA conta número: " + conta.getNumero() + " foi atualizada com sucesso!");
			
		}else
			System.out.println("\nNão foi possivel encontrar a conta número: " + conta.getNumero() + " no sistema!");
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("\nA conta número: " + numero + " foi deletada com sucesso.");
		}else
			System.out.println("\nA conta número: " + numero + " não foi encontrada.");
		
	}

	@Override
	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if (conta !=null) {
			
			if(conta.sacar(valor) == true)
				System.out.println("\nSaque na Conta número: " + numero + " foi efetuado com sucesso.");
		}else 
			System.out.println("\nA Conta número: " + numero + " não encontrada no sistema.");
		
	}

	@Override
	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);
		
		if(conta !=null) {
			conta.depositar(valor);
			System.out.println("\n Depósito na Conta número: " + numero + " efetuado com sucesso.");
		}else
			System.out.println("\nA Conta número: " + numero + " não foi encontrada ou Destino não é uma Conta Corrente.");
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);
		
		if(contaOrigem !=null && contaDestino !=null) {
			if( contaOrigem.sacar(valor) == true) {
				contaDestino.depositar(valor);
				System.out.println("\nTranferência efetuada com sucesso.");
			}
		}else
			System.out.println("\nConta de Origem e/ou Destino não foram encotradas!");
	}
	
	public int gerarNumero() {
		return ++ numero;
	}
	
	public Conta buscarNaCollection(int numero) {
		for (var conta: listaContas) {
			if (conta.getNumero() == numero) {
				return conta;
			}
		}
		
		return null;
	}

}
