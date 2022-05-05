package classe.desafioModulo;

public class PessoaDesafio {
	
	String nomeDaPessoa;
	double pesoDaPessoa;
	
	PessoaDesafio(String nomeDaPessoa, double pesoDaPessoa) {
		this.nomeDaPessoa = nomeDaPessoa;
		this.pesoDaPessoa = pesoDaPessoa;
		
	}
	
	void comer(ComidaDesafio comida) {
		if(comida != null) {
			this.pesoDaPessoa += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Olá eu sou o " + nomeDaPessoa + " e tenho " + pesoDaPessoa + "Kgs.";
	}
}
