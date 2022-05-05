package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		int contador = 1; //Numero inicial
		
		while (contador <= 10) { //Ultimo passo
			System.out.printf("i = %d\n", contador);
			contador++; //Numero de passo
		}	
	}
}
