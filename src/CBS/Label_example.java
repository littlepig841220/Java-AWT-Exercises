package CBS;

import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class Label_example extends Frame{
	private static final long serialVersionUID = 1L;
	private Label label,label2,label3;

	public static void main(String[] args) {
		new Label_example();
	}
	
	public Label_example() {
		setTitle("Label");
		setLayout(new GridLayout(3,1));
		setBounds(120, 120, 240, 240);
		
		add(label = new Label("1"));
		add(label2 = new Label("2", Label.CENTER));
		add(label3 = new Label("3"));
		
		label3.setAlignment(Label.RIGHT);
		
		label.setBackground(Color.cyan);
		label2.setBackground(Color.green);
		label3.setBackground(Color.yellow);
		
		pack();
		setVisible(true);
	}

}
