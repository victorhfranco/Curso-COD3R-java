package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		String resultadoParcial = media >= 5.0 ? "em recupera��o." : "reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "sim" : "n�o";
		
		System.out.println("Tem desconto? " + resultado);
		System.out.printf("Tem desconto? %s ", resultado);
		
		
	}
}
