package oo.polimorfismo.estatico;

public class Arroz1 {

	private double peso;

	public Arroz1(double peso) {
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
