package br.com.fiap.contas.modelo;

public abstract class Conta {

	private int numero;
	protected double saldo;
	private String agencia;
	private String titular;

	public Conta(int numero, double saldo, String agencia, String titular) {
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
		this.titular = titular;
	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}

	public abstract String getTipo();

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
