
public class Pessoa {

	// Atributos
	private String nome;
	private int idade;
	private double peso;
	private static int identificador;

	public Pessoa(String nome) {
		setNome(nome);
		identificador++;
	}

	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
		identificador++;
	}

	// Métodos
	public void caminha() {
		System.out.println("Pessoa está caminhando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getIdentificador() {
		return identificador;
	}

}
