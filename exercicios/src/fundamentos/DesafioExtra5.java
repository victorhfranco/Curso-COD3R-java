package fundamentos;

import java.util.Scanner;

public class DesafioExtra5 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Vamos calcular a �rea de um triangulo");
		System.out.println("Digite o valor da base: ");
		double b = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura: ");
		double h = entrada.nextDouble();
		
		double area = (b * h) / 2;
		System.out.println("O valor da �rea �: " + area);
		
	
		entrada.close();
	}

}
