import javax.swing.JOptionPane;

public class TestaCalculadora {
	public static void main(String[] args) {

		String[] operacoes = { "Soma", "Subtração", "Multiplicação", "Divisão" };
		int x = JOptionPane.showOptionDialog(null, "Returns the position of your choice on the array", "Click a button",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operacoes, operacoes[0]);
		String sOp1;
		float op1;
		String sOp2;
		float op2;
		Calculadora calc = new Calculadora();

		System.out.println(x);

		sOp1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		op1 = Integer.parseInt(sOp1);
		sOp2 = JOptionPane.showInputDialog("Digite o segundo numero");
		op2 = Integer.parseInt(sOp2);

		switch (x) {
		case 0:
			System.out.println(calc.somar(op1, op2));
			break;
		case 1:
			System.out.println(calc.subtrair(op1, op2));
			break;
		case 2:
			System.out.println(calc.multiplicar(op1, op2));
			break;
		case 3:
			System.out.println(calc.dividir(op1, op2));
			break;
		default:
			break;
		}
	}
}
