package CBS;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action_Event extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static Action_Event action_Event;

	public static void main(String[] args) {
		action_Event = new Action_Event();
	}
	
	public Action_Event() {
		setTitle("Action Event");
		
		Button button = new Button("test");
		button.addActionListener(this);
		
		add(button);
		setBounds(120, 120, 240, 240);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Test");
	}

}
