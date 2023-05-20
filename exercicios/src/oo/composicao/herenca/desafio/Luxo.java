package oo.composicao.herenca.desafio;

public interface Luxo {
	
	void ligarAr();
	void desligarAr();

	default int velocidadeDoAr() {
		return 1;
	}

}
