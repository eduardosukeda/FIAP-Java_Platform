package br.com.fiap.contas.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, double saldo, String agencia, String titular) {
		super(numero, saldo, agencia, titular);
	}

	@Override
	public String getTipo() {
		return "Conta Poupança";
	}

	@Override
	public void saca(double valor) {
		saldo -= (valor + 0.10);
	}
}
