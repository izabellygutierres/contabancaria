package conta.model;

public class ContaCorrente extends Conta { // extends - herança

	// atribuitos / variavel
	private float limite;

	// Metodo construtor / metodo especial
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo); // invocando o metodo construtor Conta
		this.limite = limite; // this apenas do atruto que nasceu nessa classe
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {

		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;

	}

	@Override

	// polimorfismo sobre escrita
	public void visualizar() {
		super.visualizar();
		System.out.println("limite: " + this.limite);
	}

}
