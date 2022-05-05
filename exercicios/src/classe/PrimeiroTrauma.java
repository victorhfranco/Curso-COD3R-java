package classe;

public class PrimeiroTrauma {
	
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) { //public statico
		
		PrimeiroTrauma p = new PrimeiroTrauma(); // comunicação instancia
		System.out.println(p.a); // instancia
		System.out.println(b); // statico acessa statico
		
	}
}
