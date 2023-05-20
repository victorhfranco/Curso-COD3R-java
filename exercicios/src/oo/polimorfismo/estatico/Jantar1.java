package oo.polimorfismo.estatico;

public class Jantar1 {

	public static void main(String[] args) {

		Pessoa1 convidado = new Pessoa1(99.65);

		Arroz1 ingrediente1 = new Arroz1 (0.2);
		Feijao1 ingrediente2 = new Feijao1(0.1);

		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);

		System.out.println(convidado.getPeso());

		Sorvete1 sobremesa = new Sorvete1(0.4);

		convidado.comer(sobremesa);

		System.out.println(convidado.getPeso());

	}

}
