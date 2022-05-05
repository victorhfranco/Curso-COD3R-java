package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		double a1 = 6 * (3 + 2);
		double a2 = (int) Math.pow(a1, 2);
		double a3 = a2 / (3 * 2);
		System.out.println("O resultado da primeira equação é: " + a3);
		
		double b1 = (1 - 5) * (2 - 7);
		double b2 = b1 / 2;
		double b3 = (int) Math.pow(b2, 2);
		System.out.println("O resultado da segunda equação é: " + b3);
		
		
		double c1 = a3 - b3;
		double c2 = (int) Math.pow(c1, 3);
	

		double d1 = 10;
		double d2 = (int) Math.pow(d1, 3);
		double d3 = c2 / d2;
		System.out.println("O resultado final da equação é: " + d3);
		
		
		
	}
	
}
