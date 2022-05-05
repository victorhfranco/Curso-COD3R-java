package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ol� pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("###")); //Adiciona
		System.out.println(s + "!!!"); //Adiciona
		System.out.println(s.startsWith("Boa")); //Verifica se est� iniciando com a palavra no �spas
		System.out.println(s.toLowerCase().startsWith("bom")); //Verifica se est� iniciando com a palavra no �spas em minuscula
		System.out.println(s.endsWith("tarde")); //Verifica se est� terminando com a palavra no �spas
		System.out.println(s.equalsIgnoreCase("boa tarde")); //Verifica com a palavra no �spas, independente da case
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		System.out.printf("O senhor %s %s tem %d e ganha  R$%.3f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d e ganha  R$%.3f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
	
		System.out.println("Frase qualquer".contains("qualquer")); //Verifica se existe o que contem no �spas
		System.out.println("frase qualquer".indexOf("qual")); //Verifica em qual posi��o t�
		System.out.println("frase qualquer".substring(6)); //Pega a palavra inteira da numera��o
		System.out.println("frase qualquer".substring(6, 10)); //Constroi a palavra de acordo com a numera��o
	
	}
	
}
