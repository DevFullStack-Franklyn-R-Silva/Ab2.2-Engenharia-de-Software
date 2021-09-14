package entities;

public class Conta {
	private Float saldo;
	private String codigo;

	// Construtor
	public Conta() {
	}

	public Conta(Float saldo, String codigo) {
		this.saldo = saldo;
		this.codigo = codigo;
	}

	// get e set
	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	// metodos
	public boolean sacar(float valor) {
		if (saldo > 0) {
			valor -= saldo;
			return true;
		}
		return false;
	}

	public boolean depositar(float valor) {
		valor += saldo;
		return true;
	}

	public String extrato() {
		return "Seu saldo é de: " + getSaldo();
	}

	public boolean transferir(Conta conta, float valor) {
		return true;
	}

}
