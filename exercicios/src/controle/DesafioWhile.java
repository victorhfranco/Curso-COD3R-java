package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		//calcular m�dia de uma turma, n�o sei qnts alunos tem
		//usuario digita nota valida de 0-10
		//quando digitar nota valida vai armazenar em uma variavel total
		//total vai armazenar todas as notas 
		//variavel total de notas digitadas
		//final fazer a m�dia
		//quando o usu�rio digitar -1 vai sair do programa
		//se digitar acima de 10 pedir para digitar notas validas
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota (ou -1 para sair: ");
			nota = entrada.nextDouble();
			
			
			if(nota <= 10 && nota >=0) {
			
			total += nota;
			quantidadeDeNotas++;
			} else if(nota != -1) {
				System.out.println("Nota inv�lida!!!");
			}
		}
		
		//calcular a m�dia
		double media = total / quantidadeDeNotas;
		System.out.println("M�dia = " + media);
		
		entrada.close();
		
		
		
	}
}