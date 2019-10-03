
public class TestaContas {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria();
		c1.deposita(100);
		System.out.println(c1.getSaldo());
		c1.saque(10);
		System.out.println(c1.getSaldo());

		ContaBancaria c2 = new ContaBancaria();
		c2.deposita(200);
		System.out.println(c2.getSaldo());
		c2.saque(20);
		System.out.println(c2.getSaldo());
	}
}
