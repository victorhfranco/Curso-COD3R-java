package classe.desafioModulo;

public class JantarDesafio {
	public static void main(String[] args) {
		
		ComidaDesafio c1 = new ComidaDesafio("Arroz", 0.223);
		ComidaDesafio c2 = new ComidaDesafio("Feijao", 0.300);
		
		PessoaDesafio p = new PessoaDesafio("Joao", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
	}

}
