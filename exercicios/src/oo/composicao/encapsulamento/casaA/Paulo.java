package oo.composicao.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();

	void testeAcessos() {
		// segredo
		// FacoDentroDeCasa
		// formaDeFalar
		// TodosSabem
		// System.out.println(esposa.segredo); // PRIVATE
		System.out.println(esposa.FacoDentroDeCasa); // DEFAULT - PACKAGE
		System.out.println(esposa.formaDeFalar); // PROTECTED
		System.out.println(esposa.TodosSabem); // PUBLIC

	}
}
