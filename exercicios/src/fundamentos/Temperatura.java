package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		
		double fahrentheit = 150;
		double celsius = (fahrentheit - ajuste) * fator;
		
		
		
		
		System.out.println("O resultado da temperatura é " + celsius + "°C");
		
		
	}
}
