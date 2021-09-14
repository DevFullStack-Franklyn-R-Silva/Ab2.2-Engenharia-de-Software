package entities;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Float saldo, String codigo) {
		super(saldo, codigo);
	}

	public boolean transferir(Conta conta, float valor) {
		return false;
	}

	public boolean sacar(float valor) {
		
		return true;
	}

}
