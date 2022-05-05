package controle;

public class Continue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) { //passe de dois  i%2
				continue;
			}
			
			System.out.println(i);
		}
		
		for (int i = 1; i < 10; i++) {
			if(i == 5) continue; //apenas não aparece o 5 e continua
			System.out.println(i);
		}
	}

}
