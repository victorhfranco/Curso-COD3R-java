package oo.composicao.herenca.desafio.estudo;

public class Moto {
	
	int velocidadeAtual;

	void acelerar() {
		velocidadeAtual += 7;
	}

	void frear() {
		if (velocidadeAtual >= 7) {
			velocidadeAtual -= 7;
		} else {
			velocidadeAtual = 0;
		}
	}
	public String toString() {
		return velocidadeAtual + "KM/H";
	}
}
