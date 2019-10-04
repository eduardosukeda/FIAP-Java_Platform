
public class TestaContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.getSaldo());
		cc.saque(10);
		System.out.println(cc.getSaldo());
		cc.setTitular("Eduardo Corrente");
		System.out.println(cc.getTitular());
		System.out.println(cc.getTipo());
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.deposita(100);
		System.out.println(cp.getSaldo());
		cp.saque(10);
		System.out.println(cp.getSaldo());
		cp.setTitular("Eduardo Poupanca");
		System.out.println(cp.getTitular());
		System.out.println(cp.getTipo());
	}
}
