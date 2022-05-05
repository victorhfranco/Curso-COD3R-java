package controle;

import java.util.Scanner;

public class DesafioExtra3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
				
		System.out.println("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0) {
			System.out.println("Sua nota é " + media + " você está aprovado!");
		} else if (media >= 4.0) {
			System.out.println("Sua nota é " + media + " você está em recuperação!");
		} else {
			System.out.println("Sua nota é " + media + " você está reprovado!");
		}
		
		entrada.close();
		
	}

}
