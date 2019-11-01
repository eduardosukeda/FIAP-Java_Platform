
public class ControleBonificacao {

	private int totalBonificacao = 0;

	public void registra(Funcionario f) {
		totalBonificacao += f.getBonificacao();
	}

	public int getTotalBonificacao() {
		return totalBonificacao;
	}
}
