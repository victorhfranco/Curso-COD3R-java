package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		//calcular média de uma turma, não sei qnts alunos tem
		//usuario digita nota valida de 0-10
		//quando digitar nota valida vai armazenar em uma variavel total
		//total vai armazenar todas as notas 
		//variavel total de notas digitadas
		//final fazer a média
		//quando o usuário digitar -1 vai sair do programa
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
				System.out.println("Nota inválida!!!");
			}
		}
		
		//calcular a média
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		entrada.close();
		
		
		
	}
}