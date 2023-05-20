package oo.composicao.herenca.desafio.estudo;

public class DigitalPainel {
	
	public static void main(String[] args) {
		
		Bros cBros = new Bros();
		cBros.acelerar();
		cBros.acelerar();
		cBros.acelerar();
		cBros.acelerar();
		cBros.acelerar();
		cBros.acelerar();
		cBros.acelerar();
		cBros.acelerar();
		cBros.acelerar();
		cBros.frear();
		System.out.println("A velocidade atual da Bros é " + cBros);
		
		Hornet cHornet = new Hornet();
		cHornet.acelerar();
		cHornet.acelerar();
		cHornet.acelerar();
		cHornet.acelerar();
		cHornet.acelerar();
		cHornet.acelerar();
		cHornet.acelerar();
		cHornet.acelerar();
		cHornet.acelerar();
		cHornet.frear();
		System.out.println("A velocidade atual da Hornet é " + cHornet);
		
	}
}
