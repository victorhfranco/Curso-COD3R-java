package streams;

public class SiteProdutos1 extends FilterDesafio1 {

	final String produtos;
	final double preco;
	final double desconto;
	final double valorFrete;

	public SiteProdutos1(String produtos, double preco, double desconto, double valorFrete) {
		this.produtos = produtos;
		this.preco = preco;
		this.desconto = desconto;
		this.valorFrete = valorFrete;
	}
}
