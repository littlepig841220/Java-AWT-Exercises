package CBS;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Choice_example extends Frame implements ItemListener{
	private static final long serialVersionUID = 1L;
	private Choice choice;
	private CheckboxGroup checkboxGroup;
	private Checkbox checkbox,checkbox2,checkbox3;

	public static void main(String[] args) {
		new Choice_example();
	}
	
	public Choice_example() {
		setTitle("Choice");
		setLayout(new GridLayout(4,1));
		setBounds(120, 120, 240, 240);
		
		checkboxGroup = new CheckboxGroup();
		choice = new Choice();
		
		choice.add("1");
		choice.add("2");
		choice.add("3");
		
		add(choice);
		add(checkbox = new Checkbox("1",true,checkboxGroup));
		add(checkbox2 = new Checkbox("2",false,checkboxGroup));
		add(checkbox3 = new Checkbox("3",false,checkboxGroup));
		
		choice.addItemListener(this);
		checkbox.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		
		pack();
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object object = e.getSource();
		
		if(object.equals(checkbox)) {
			choice.select(0);
		}else if(object.equals(checkbox2)) {
			choice.select(1);
		}else if(object.equals(checkbox3)) {
			choice.select(2);
		}else {
			if(choice.getSelectedIndex() == 0) {
				checkbox.setState(true);
			}else if(choice.getSelectedIndex() == 1) {
				checkbox2.setState(true);
			}else {
				checkbox3.setState(true);
			}
		}
	}
	
}
