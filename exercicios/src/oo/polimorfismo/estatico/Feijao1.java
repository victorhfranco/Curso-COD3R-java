package oo.polimorfismo.estatico;

public class Feijao1 {

	private double peso;

	public Feijao1(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > -0) {
			this.peso = peso;
		}
	}
}
