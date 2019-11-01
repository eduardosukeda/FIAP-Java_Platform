
public class Funcionario {

	private int numero;
	private String nome;

	Funcionario() {

	}

	Funcionario(int xNumero, String xNome) {
		numero = xNumero;
		nome = xNome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	void trabalha() {
		System.out.println("Funcionário que Trabalha");
	}

	public int getBonificacao() {
 		return 10;
	}
}
