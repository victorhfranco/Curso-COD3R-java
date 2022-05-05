package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1;
		a--; // a = a - 1;
		
		++b; // b = b + 1;
		--b; // b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini desafio");
		System.out.println(++a == b--); // o sinal antes da variavel decrementa imediatamente, e após depois
		System.out.println(a == b);
		System.out.println(a); // valor da 2 por conta de estar antes
		System.out.println(b); // valor da 1 por estar depois do operante e depois da variavel
		
	}

}
