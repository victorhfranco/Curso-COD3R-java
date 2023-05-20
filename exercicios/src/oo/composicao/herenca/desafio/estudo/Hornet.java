package oo.composicao.herenca.desafio.estudo;

public class Hornet extends Moto {
	
	@Override
	void acelerar() {
		velocidadeAtual += 35;
	}
	
	@Override
	void frear() {
		velocidadeAtual -= 50;
	}
}
