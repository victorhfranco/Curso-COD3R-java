package controle;

import java.util.Scanner;

public class DesafioExtra1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um numero");
		int numero = scanner.nextInt();
		
		if (numero >= 0 && numero <= 10) {
				if (numero % 2 == 0) {
				System.out.println("O numero " + numero + " est� entre 0 e 10 e � um par.");
				} else {
					System.out.println("O numero " + numero + " est� entre 0 e 10 mas n�o � um par.");
				}
		} else {
			System.out.println("O numero " + numero + " n�o est� entre 0 e 10.");
		}
		scanner.close();
	}
}