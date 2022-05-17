package CBS;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBox_example extends Frame implements ItemListener{
	private static final long serialVersionUID = 1L;
	private Checkbox checkbox,checkbox2,checkbox3;

	public static void main(String[] args) {
		new CheckBox_example();
	}
	
	public CheckBox_example() {
		setTitle("CheckBox");
		setLayout(new GridLayout(1,3));
		setBounds(120, 120, 240, 240);
		
		add(checkbox = new Checkbox("1"));
		add(checkbox2 = new Checkbox("2"));
		add(checkbox3 = new Checkbox("3"));
		
		checkbox.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		
		pack();
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Checkbox cb = (Checkbox)e.getSource();
		
		if(cb.getState()) {
			cb.setLabel("Select");
		}else {
			cb.setLabel("");
		}
	}

}
