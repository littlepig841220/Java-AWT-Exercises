package CBS;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_example extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Button button,button2;

	public static void main(String[] args) {
		new Button_example();
	}
	
	public Button_example() {
		setTitle("Button");
		setLayout(new GridLayout(2,1));
		setBounds(120, 120, 240, 240);
		
		add(button = new Button("UP"));
		add(button2 = new Button("DOWN"));
		
		button.setActionCommand("up");
		button2.setActionCommand("down");
		
		button.addActionListener(this);
		button2.addActionListener(this);
		
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("down")) {
			if(button.getBackground() == Color.BLUE) {
				button.setBackground(Color.red);
			}else {
				button.setBackground(Color.blue);
			}
		}else {
			if(button2.getBackground() == Color.BLUE) {
				button2.setBackground(Color.red);
			}else {
				button2.setBackground(Color.blue);
			}
		}
	}
}
