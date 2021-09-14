package entities;

public class ContaPoupanca extends Conta{

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Float saldo, String codigo) {
		super(saldo, codigo);
	}

	public boolean transferir(Conta conta, float valor) {
		return false;
	}

	public boolean sacar(float valor) {
		return false;
	}
	
}
