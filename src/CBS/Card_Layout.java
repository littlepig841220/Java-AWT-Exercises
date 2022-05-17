package CBS;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class Card_Layout extends Frame{
	private static final long serialVersionUID = 1L;
	private static CardLayout cardLayout;

	public static void main(String[] args) {
		Card_Layout card_Layout =  new Card_Layout();
		
		try {
			cardLayout.first(card_Layout);
			
			while(true) {
				Thread.sleep(500);
				cardLayout.next(card_Layout);
			}
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public Card_Layout() {
		setSize(230, 90);
		setTitle("Card Layout");
		setResizable(false);
		setFont(new Font("�з���", Font.BOLD, 24));
		setBackground(Color.CYAN);
		
		Label label = new Label("    �˼ƭp��");
		Label label2 = new Label("    ��");
		Label label3 = new Label("     ��");
		Label label4 = new Label("      �p");
		Label label5 = new Label("       ��");
		
		cardLayout = new CardLayout(10, 10);
		
		setLayout(cardLayout);
		add("label",label);
		add("label2",label2);
		add("label3",label3);
		add("label4",label4);
		add("label5",label5);
		
		setVisible(true);
	}
}
