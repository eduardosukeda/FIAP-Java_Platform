
public class ContaPoupanca extends ContaBancaria {

	@Override
	public String getTipo() {
		return super.getTipo() + "Poupanca";
	}
}
