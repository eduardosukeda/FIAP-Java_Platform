import java.time.LocalDate;

public class ContaCorrente {

	private String titular;
	protected double saldo;
	private int numero;
	private String nome;
	private String endereco;
	private String cpf;
	private LocalDate dataNascimento;

	public ContaCorrente(String nome, String endereco, String cpf, LocalDate dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public boolean equals(Object obj) {
		ContaCorrente conta = (ContaCorrente) obj;
		return (conta.cpf.equals(this.cpf));
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saque(double valor) throws SaldoInsuficiente {
		if (this.saldo < valor) {
			throw new SaldoInsuficiente("Saldo insuficiente para saque");
		}

		this.saldo -= valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
