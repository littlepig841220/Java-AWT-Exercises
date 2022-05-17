package CBS;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxGroup_example extends Frame implements ItemListener{
	private static final long serialVersionUID = 1L;
	private CheckboxGroup checkboxGroup;
	private Checkbox checkbox,checkbox2,checkbox3,checkbox4,checkbox5,checkbox6;

	public static void main(String[] args) {
		new CheckBoxGroup_example();
	}
	
	public CheckBoxGroup_example() {
		setTitle("CheckBoxGroup");
		setLayout(new GridLayout(2,3));
		setBounds(120, 120, 240, 240);
		
		checkboxGroup = new CheckboxGroup();
		
		add(checkbox = new Checkbox("1"));
		add(checkbox2 = new Checkbox("2"));
		add(checkbox3 = new Checkbox("3"));
		add(checkbox4 = new Checkbox("4",true,checkboxGroup));
		add(checkbox5 = new Checkbox("5",false,checkboxGroup));
		add(checkbox6 = new Checkbox("6",false,checkboxGroup));
		
		checkbox.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		checkbox4.addItemListener(this);
		
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
