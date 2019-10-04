
public class ContaBancaria {
	private String titular;
	protected double saldo;
	private int numero;
	
	public String getTipo() {
		return "Conta ";
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) {
		this.saldo -= valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
