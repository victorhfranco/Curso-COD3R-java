package oo.polimorfismo.estatico;

public class Pessoa1 {

	private double peso;

	public Pessoa1(double peso) {
		setPeso(peso);
	}

	public void comer(Feijao1 feijao1) {
		this.peso += feijao1.getPeso();
	}

	public void comer(Arroz1 arroz1) {
		this.peso += arroz1.getPeso();
	}

	public void comer(Sorvete1 sorvete1) {
		this.peso += sorvete1.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;

		}
	}

}
