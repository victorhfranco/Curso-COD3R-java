package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();

		// Offer e Add -> Adicionam elemntos na fila
		// Diferen?a ? o comportamento quando a fila esta cheia!

		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // lan?a uma exce??o
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");

		// Peek e Element -> Obter o pr?ximo elemento
		// da fila sem (Remover)

		// Diferen?a ? o comportamento ocorre
		// quando a filha est? vazia..

		System.out.println(fila.peek()); // retorna false
		System.out.println(fila.peek());
		System.out.println(fila.element()); // lan?a uma exce??o
		System.out.println(fila.element());

		// Pol e Remove -> Obter o pr?ximo elemento
		// da fila sem (Remover)

		// Diferen?a ? o comportamento ocorre
		// quando a filha est? vazia..

		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // lan?a uma exce??o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(....);
	}

}
