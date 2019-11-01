import java.time.LocalDate;

import javax.swing.JOptionPane;

public class TesteErro {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (NullPointerException e) {
			System.out.println("erro: " + e);
		}
		System.out.println("Fim do main");
	}

	static void metodo1() {
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}

	static void metodo2() {
		System.out.println("Inicio do metodo 2");
		ContaCorrente cc = new ContaCorrente("Eduardo", "Rua 1", "123456", LocalDate.of(2019, 10, 31));
		metodo3(cc);

//		for (int i = 0; i <= 15; i++) {
//			cc.deposita(i + 1000);
//			System.out.println(cc.getSaldo());
//			if (i == 5) {
//				cc = null;
//			}
//		}

		System.out.println("Fim do metodo 2");
	}

	static void metodo3(ContaCorrente cc) {
		Double valueDeposita = Double.valueOf(JOptionPane.showInputDialog("Valor Depósito"));
		cc.deposita(valueDeposita);
		System.out.println("Valor final: " + cc.getSaldo());

		ContaCorrente c2 = new ContaCorrente("Eduardo", "Rua 2", "654321", LocalDate.of(2019, 10, 31));

		boolean cpf = cc.equals(c2);

		Double valueSaca = Double.valueOf(JOptionPane.showInputDialog("Valor do saque"));

		try {
			cc.saque(valueSaca);
		} catch (SaldoInsuficiente e) {
			e.printStackTrace();
		}

		System.out.println("Valor final 2: " + cc.getSaldo());
		System.out.println("CPF é igual ? " + cpf);
		System.out.println("Data de Nascimento " + cc.getDataNascimento());
		
		ClassificacaoClientes.POTENCIAL.isCompatible(cc);
		ClassificacaoClientes.MEDIO.isCompatible(cc);
		ClassificacaoClientes.BAIXO.isCompatible(cc);
	}
}
