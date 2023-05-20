package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio {
	
	public static void main(String[] args) {
		
		System.out.println("Controle semana 39: \nMáquinas a seguir com menos de 3:00 horas de PNP\n");
		
		MaquinasDesafio m1 = new MaquinasDesafio("Francesa 1", 2.00, true);
		MaquinasDesafio m2 = new MaquinasDesafio("Francesa 2", 3.00, true);
		MaquinasDesafio m3 = new MaquinasDesafio("SERAC Flex", 5.50, false);
		MaquinasDesafio m4 = new MaquinasDesafio("Arcil", 2.00, true);
		MaquinasDesafio m5 = new MaquinasDesafio("Decor", 3.20, false);
		MaquinasDesafio m6 = new MaquinasDesafio("Hamba", 4.10, false);
		MaquinasDesafio m7 = new MaquinasDesafio("Brascop", 2.40, true);
		MaquinasDesafio m8 = new MaquinasDesafio("Erca", 0.50, true);
		MaquinasDesafio m9 = new MaquinasDesafio("Gualapack", 1.30, true);
		MaquinasDesafio m10 = new MaquinasDesafio("Brasileira", 1.00, true);
		
		List<MaquinasDesafio> maquinas =
				Arrays.asList(m1, m2, m3, m4, m5, m6, m7, m8, m9, m10);
		
		Predicate<MaquinasDesafio> paradaHoras = p -> p.horas <= 3;
		Predicate<MaquinasDesafio> paradaOk = p -> p.maximoparadas;
		Function<MaquinasDesafio, String> maquinasOk = 
				p -> "Máquina " + p.nome + " segue dentro do controle semanal!\nExatamente com " 
		+ p.horas + " horas de PNP.\n";
		
		maquinas.stream()
			.filter(paradaHoras)
			.filter(paradaOk)
			.map(maquinasOk)
			.forEach(System.out::println);

	}

}
