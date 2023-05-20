package streams;

public class MaquinasDesafio extends FilterDesafio {
	
	final String nome;
	final double horas;
	final boolean maximoparadas;
	
	public MaquinasDesafio(String nome, double horas, boolean maximoparadas) {
		this.nome = nome;
		this.horas = horas;
		this.maximoparadas = maximoparadas;
	}

}
