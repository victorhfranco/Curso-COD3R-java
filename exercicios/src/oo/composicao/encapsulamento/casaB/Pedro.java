package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcessos() {

		// System.out.println(mae.segredo); PRIVATE
		// System.out.println(mae.FacoDentroDeCasa); DEFAULT - PACKAGE
		System.out.println(formaDeFalar); // RECEBENDO POR HERAN�A
		System.out.println(TodosSabem); // RECEBENDO POR HERAN�A
		System.out.println(new Ana().TodosSabem); // RECEBENDO POR HERAN�A
	}

}
