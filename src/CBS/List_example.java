package CBS;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

public class List_example extends Frame implements ItemListener{
	private static final long serialVersionUID = 1L;
	private List list;
	private Checkbox checkbox,checkbox2,checkbox3;

	public static void main(String[] args) {
		new List_example();
	}
	
	public List_example() {
		setTitle("List");
		setLayout(new GridLayout(4,1));
		setBounds(120, 120, 240, 240);
		
		list = new List();
		list.setMultipleMode(true);
		list.add("1");
		list.add("2");
		list.add("3");
		
		add(list);
		add(checkbox = new Checkbox("1"));
		add(checkbox2 = new Checkbox("2"));
		add(checkbox3 = new Checkbox("3"));
		
		list.addItemListener(this);
		checkbox.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		
		pack();
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object object = new Object();
		
		if(object.equals(checkbox)) {
			if(checkbox.getState() == true) {
				list.select(0);
			}else {
				list.deselect(0);
			}
		}else if(object.equals(checkbox2)) {
			if(checkbox2.getState() == true) {
				list.select(1);
			}else {
				list.deselect(1);
			}
		}else if(object.equals(checkbox3)) {
			if(checkbox3.getState() == true) {
				list.select(2);
			}else {
				list.deselect(2);
			}
		}else {
			checkbox.setState(list.isIndexSelected(0));
			checkbox2.setState(list.isIndexSelected(1));
			checkbox3.setState(list.isIndexSelected(2));
		}
	}

}
