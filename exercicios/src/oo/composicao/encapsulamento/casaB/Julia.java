package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
	
		Ana sogra = new Ana();
		
		//System.out.println(sogra.segredo); // PRIVATE
		//System.out.println(sogra.FacoDentroDeCasa); // DEFAULT - PACKAGE
		//System.out.println(sogra.formaDeFalar); PROTECTED
		System.out.println(sogra.TodosSabem); // PUBLIC acessando outro pacote.
		
	}

}
