package fundamentos;

import java.util.Scanner;

public class DesafioExtra3 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		double altura = entrada.nextDouble();
		
		final double calculo = peso / (altura * altura);
		
		System.out.println("O calculo idel de IMC é " + calculo);
		
		entrada.close();
		
		
	}
}
