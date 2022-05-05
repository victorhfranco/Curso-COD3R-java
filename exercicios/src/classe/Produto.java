package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25; // desconto estático na classe
	
	Produto() {
		
	}

	Produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;

	} // Novo modelo construtor
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

}
