package fundamentos;

import java.util.Scanner;

public class DesafioExtra5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos calcular a área de um triangulo");
		System.out.println("Digite o valor da base: ");
		double b = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double h = entrada.nextDouble();
		
		double area = (b * h) / 2;
		System.out.println("O valor da área é: " + area);
		
	
		entrada.close();
	}

}
