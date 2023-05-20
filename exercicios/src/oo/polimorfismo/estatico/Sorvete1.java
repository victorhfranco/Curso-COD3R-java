package oo.polimorfismo.estatico;

public class Sorvete1 {

	private double peso;

	public Sorvete1(double peso) {
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
