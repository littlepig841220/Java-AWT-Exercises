package CBS;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class TextField_example extends Frame{
	private static final long serialVersionUID = 1L;
	private Label label;
	private TextField textField;
	private Button button;

	public static void main(String[] args) {
		new TextField_example();
	}
	
	public TextField_example() {
		setTitle("TextField");
		setLayout(new GridLayout(3,1));
		setBounds(120, 120, 240, 240);
		
		add(label = new Label("Enter the word"));
		add(textField = new TextField());
		add(button = new Button("Enter"));
		
		pack();
		setVisible(true);
	}

}
