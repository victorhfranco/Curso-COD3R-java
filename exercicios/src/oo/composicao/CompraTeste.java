package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Jo�o Pedro";
		compra1.adicionarItem("Caneta" , 20, 7.45); // J� instancia e seta.
		compra1.adicionarItem(new Item("Borracha" , 12, 3.89));
		compra1.adicionarItem(new Item("Caderno" , 3, 18.79));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}

}
