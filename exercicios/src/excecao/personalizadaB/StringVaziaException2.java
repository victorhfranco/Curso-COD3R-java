package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException2 extends Exception {
	
	private String nomeDoAtributo;
	
	public StringVaziaException2(String nomeDoAtributo) {
		
	}
	
	public String getMessage() {

		return String.format("O atributo '%s' está negativo", nomeDoAtributo);
	}

}
