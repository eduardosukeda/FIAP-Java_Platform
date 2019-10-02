
public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Eduardo", 22);
		Pessoa p2 = new Pessoa("Daniel", 34);
		Pessoa p3 = new Pessoa("Luis", 34);
		p3 = p2;
		System.out.println(p1.getNome());
		System.out.println(p1.getIdentificador());
	}
}
