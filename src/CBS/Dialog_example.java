package CBS;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog_example extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static Button button;

	public static void main(String[] args) {
		new Dialog_example();
	}
	
	public Dialog_example() {
		setSize(250,200);
		setTitle("Dialog example");
		setResizable(false);
		
		add(button = new Button("Quit"));
		
		button.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new MyDialog(this, "Warning", true);
	}

}

class MyDialog extends Dialog implements ActionListener{
	private static final long serialVersionUID = 1L;
	private Button button,button2;

	public MyDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		setSize(180, 90);
		setTitle("Quit");
		setLayout(new FlowLayout());
		
		add(new Label("Quit?",Label.CENTER));
		add(button = new Button("Yes"));
		add(button2 = new Button("No"));
		
		button.addActionListener(this);
		button2.addActionListener(this);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.exit(0);
		}else if(e.getSource() == button2) {
			setVisible(false);
		}
	}
	
}