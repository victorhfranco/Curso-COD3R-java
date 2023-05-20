package oo.composicao.desafio.attAcesso;

import oo.composicao.herenca.desafio.Fusca;
import oo.composicao.herenca.desafio.Jetta;

public class Painel {
	
	public static void main(String[] args) {
		
		Jetta c1 = new Jetta(215);
		c1.ligarTurbo();
		c1.ligarAr();
		c1.desligarAr();
		System.out.println("[JETTA] " + c1 + "KM/H");
		
		c1.acelerar();
		System.out.println("[JETTA] " + c1 + "KM/H");
		
		c1.acelerar();
		System.out.println("[JETTA] " + c1 + "KM/H");
		
		c1.acelerar();
		System.out.println("[JETTA] " + c1 + "KM/H");
		
		Fusca c2 = new Fusca ();
		c2.acelerar();
		System.out.println("[FUSCA] " + c2 + "KM/H");
		
		c2.acelerar();
		System.out.println("[FUSCA] " + c2 + "KM/H");
		
		c2.acelerar();
		System.out.println("[FUSCA] " + c2 + "KM/H");
		
		c2.acelerar();
		System.out.println("[FUSCA] " + c2 + "KM/H");
	}

}
