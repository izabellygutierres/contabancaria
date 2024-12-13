package conta;

import java.util.Scanner;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		//Instaciamento | Classe -> Objeto Ultilizavel
		ContaCorrente c1 = new ContaCorrente(2, 123, 1, "Maria dos Anjos",10000.0f,0f);
		c1.visualizar();
		c1.sacar(12000.0f);
		c1.visualizar();
		c1.depositar(500.0f);
		c1.visualizar();
		
		ContaCorrente cc1 = new ContaCorrente(2, 123, 1, "Fernando Limeira", 15000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(12000.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//limite fixo 
		/*ContaCorrente cc2 = new ContaCorrente(3, 123, 1, "Amanda Souza", 1000.0f);
		cc2.visualizar();
		cc2.sacar(12000.0f);
		cc2.visualizar();
		cc2.depositar(5000.0f);
		cc2.visualizar();*/
		
		//classe da Conta poupança
		ContaPoupanca cp1 = new ContaPoupanca(1, 123, 2, "Elaine dos Santos", 100000.0f, 15);
		cp1.visualizar();
        cp1.sacar(1000.0f);
		cp1.visualizar();
		cp1.depositar(5000.0f);
		cp1.visualizar();
		
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		
		while (true) {
			
			System.out.println(Cores.TEXT_GREEN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 BANCO IGS - BRASIL                  ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			opcao= leia.nextInt();
			
			if( opcao == 9) {
				
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "\nNo BANCO IGS - BRASIL: Seu futuro começa aqui!0");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Criar Conta\n\n");

				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Saque\n\n");

				break;
			case 7:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Depósito\n\n");

				break;
			case 8:
				System.out.println(Cores.TEXT_WHITE_BOLD +"Transferência entre Contas\n\n");

				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n" + Cores.TEXT_RESET);
				break;
				
			}
		}

	}
	
	public static void sobre() {
		
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Izabelly Gutierres Silva - izabellygutierressilva@gmail.com");
		System.out.println("github.com/izabellygutierres");
		System.out.println("*********************************************************");
	}

}
