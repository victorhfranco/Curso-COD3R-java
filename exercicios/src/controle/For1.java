package controle;

public class For1 {
	
	public static void main(String[] args) {
		
		//      inicio        m�ximo          passe
		for(int contador = 0; contador <= 20; contador +=2) {
			System.out.printf("i = %d\n", contador);
		}
		
		int x = 2;
		for(; x < 10;) {
			System.out.println("x =" + x);
			x++;
		}
	}
}