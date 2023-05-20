package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador");
		
		//PARA A APLICAÇÃO APÓS FECHAR A JANELA
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//DIMENSOES
		janela.setSize(600, 200);
		//LAYOUT ACABAMENTO
		janela.setLayout(new FlowLayout());
		//CENTRALIZAR NA TELA DO COMPUTADOR
		janela.setLocationRelativeTo(null);
		
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		
		//PODEMOS UTILIZAR LAMBDA
		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu!");
		});
		
		janela.setVisible(true);
	}
}
