package oo.composicao.encapsulamento.copy;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", 30);
		p1.setIdade(105); // Alterar de acordo com If
		
		System.out.println(p1.getIdade()); // Ler
		System.out.println(p1); // toString
	}

}
