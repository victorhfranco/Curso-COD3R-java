package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio1 {
	
	public static void main(String[] args) {
		
		SiteProdutos1 p1 = new SiteProdutos1("Lapis", 1.99, 0.35, 0);
		SiteProdutos1 p2 = new SiteProdutos1("Notebook", 4899.89, 0.32, 00);
		SiteProdutos1 p3 = new SiteProdutos1("Caderno", 30, 0.45, 0);
		SiteProdutos1 p4 = new SiteProdutos1("Impressora", 1200, 0.40, 0);
		SiteProdutos1 p5 = new SiteProdutos1("iPad", 3100, 0.29, 0);
		SiteProdutos1 p6 = new SiteProdutos1("Relogio", 1900, 0.12, 0);
		SiteProdutos1 p7 = new SiteProdutos1("Monitor", 800, 0.31, 0);
		
		List<SiteProdutos1> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
		
		Predicate<SiteProdutos1> superPromocao = p -> p.desconto >= 0.3;
		Predicate<SiteProdutos1> freteGratis = p -> p.valorFrete == 0;
		Predicate<SiteProdutos1> produtoRelevant = p -> p.preco >= 500;
		
		Function<SiteProdutos1, String> chamadaPromocional =
				p -> "Aproveite! " + p.produtos + " por R$" + p.preco;
		
		produtos.stream()
			.filter(superPromocao)
			.filter(freteGratis)
			.filter(produtoRelevant)
			.map(chamadaPromocional)
			.forEach(System.out::println);
		
	}
	

}
