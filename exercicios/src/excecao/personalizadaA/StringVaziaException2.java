package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException2 extends RuntimeException {
	
	private String nomeDoAtributo;
	
	public StringVaziaException2(String nomeDoAtributo) {
		
	}
	
	public String getMessage() {

		return String.format("O atributo '%s' está negativo", nomeDoAtributo);
	}

}
