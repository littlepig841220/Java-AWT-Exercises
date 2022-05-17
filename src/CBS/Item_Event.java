package CBS;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

public class Item_Event extends Frame implements ItemListener{
	private static final long serialVersionUID = 1L;
	private Label label,label2;
	private TextField textField;
	private List list;

	public static void main(String[] args) {
		new Item_Event();

	}
	
	public Item_Event() {
		setTitle("Item Event");
		setLayout(new GridLayout(1,4));
		setBounds(120, 120, 240, 240);
		
		list = new List();
		list.add("Yahoo");
		list.add("Google");
				
		add(label2 = new Label("網址:"));
		add(textField = new TextField("",15));
		add(label = new Label("我的最愛:"));
		add(list);
		
		textField.setEditable(false);
		list.addItemListener(this);
		pack();
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		List l = (List)e.getItemSelectable();
		switch (l.getSelectedIndex()) {
		case 0:
			textField.setText("www.yahoo.com.tw");
			break;
			
		case 1:
			textField.setText("www.google.com");
			break;
			
		default:
			textField.setText("test");
			break;
		}
	}

}
