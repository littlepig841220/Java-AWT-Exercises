package CBS;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Text_Event extends Frame implements TextListener{
	private static final long serialVersionUID = 1L;
	private Label label,label2;
	private TextField textField,textField2;

	public static void main(String[] args) {
		new Text_Event();
	}
	
	public Text_Event() {
		setTitle("Text Event");
		setLayout(new GridLayout(1,4));
		setBounds(120, 120, 240, 240);
		
		add(label = new Label("meter:"));
		add(textField = new TextField("",20));
		add(label2 = new Label("centimeter:"));
		add(textField2 = new TextField("",20));
		
		textField.addTextListener(this);
		textField2.addTextListener(this);
		
		pack();
		setVisible(true);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		TextField tmp = (TextField)e.getSource();
		Double double1 = Double.valueOf(tmp.getText());
		double double2 = double1.doubleValue();
		
		if(tmp == textField) {
			textField2.removeTextListener(this);
			double2 = double2 * 100;
			textField2.setText(Double.toString(double2));
			textField2.addTextListener(this);
		}else {
			textField.removeTextListener(this);
			double2 = double2 / 100;
			textField.setText(Double.toString(double2));
			textField.addTextListener(this);
		}
	}

}
