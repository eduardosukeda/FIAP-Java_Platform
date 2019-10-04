
public class ContaCorrente extends ContaBancaria {

	@Override
	public void saque(double valor) {
		saldo -= (valor + 0.10);
	}

	@Override
	public String getTipo() {
		return super.getTipo() + "Corrente";
	}
}
