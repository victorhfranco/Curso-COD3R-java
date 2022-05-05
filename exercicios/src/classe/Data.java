package classe;

public class Data {
	//dia, mes, ano
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		// dia = 1;
		// mes = 1;
		// ano = 1970;
		this(1, 1, 1970);
	}
	

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		// final String formato = "%d/%d/%d"; VARIÁVEL LOCAL
		return String.format("%d/%d/%d", dia, mes, ano); //MELHOR FORMA
		// return String.format(formato, this.dia, mes, ano); //MELHOR FORMA
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada()); //NÃO RODA EM APLICAÇÕES
	}

}