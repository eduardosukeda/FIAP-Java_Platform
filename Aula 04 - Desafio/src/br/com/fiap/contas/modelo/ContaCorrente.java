package br.com.fiap.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int numero, double saldo, String agencia, String titular) {
		super(numero, saldo, agencia, titular);
	}

	@Override
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		}
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		this.saldo -= (valor + 0.10);
	}
}
