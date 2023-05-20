package oo.composicao.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	
	private String getNome() {
		return nome;
	}


	private void setNome(String nome) {
		this.nome = nome;
	}


	// Getters - Ler
	public int getIdade() {
		return idade;
	}

	// Setters - Alterar
	public void setIdade(int novaIdade) {
		//novaIdade = Math.abs(novaIdade); Converter - p/ +
		if (novaIdade >= 0 && novaIdade <= 105) {
			this.idade = novaIdade;
		}
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() + " tenho " + getIdade() + " anos";
	}
}
