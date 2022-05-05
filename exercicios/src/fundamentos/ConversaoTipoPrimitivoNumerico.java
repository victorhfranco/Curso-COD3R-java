package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1.0; //implícita
		System.out.println(a);
	
		float b = (float) 1.123323245; //explicita (cast)
		System.out.println(b);
		
		int c = 340; //explicita (cast)
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1; //explicita (cast)
		int f = (int) e;
		System.out.println(f);
		
	}

}
