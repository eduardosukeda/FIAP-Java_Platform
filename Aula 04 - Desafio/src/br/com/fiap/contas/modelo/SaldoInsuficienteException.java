package br.com.fiap.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	private static final long serialVersionUID = -9088364542357906755L;

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de: " + valor);
	}

}