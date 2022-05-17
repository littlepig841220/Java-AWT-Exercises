package CBS;

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

public class Menu_example extends Frame implements ActionListener, ItemListener{
	private static final long serialVersionUID = 1L;
	private static TextArea textArea;
	private static MenuItem menuItem = new MenuItem("Quit");
	private static CheckboxMenuItem checkboxMenuItem[] = new CheckboxMenuItem[3];

	public static void main(String[] args) {
		new Menu_example();
	}
	
	public Menu_example() {
		setSize(200,150);
		setTitle("Menu example");
		setBackground(Color.CYAN);
		setResizable(false);
		
		MenuBar menuBar = new MenuBar();
		Menu menu = new Menu("Menu");
		Menu menu2 = new Menu("Function");
		menuBar.add(menu);
		menu.add(menu2);
		menu.addSeparator();
		menu.add(menuItem);
		
		for(int a = 0;a < 3;a++) {
			checkboxMenuItem[a] = new CheckboxMenuItem("Function " + (a + 1));
			menu2.add(checkboxMenuItem[a]);
		}
		
		textArea = new TextArea("", 0, 0, TextArea.SCROLLBARS_NONE);
		
		add(textArea);
		
		setMenuBar(menuBar);
		
		menuItem.addActionListener(this);
		checkboxMenuItem[0].addItemListener(this);
		checkboxMenuItem[1].addItemListener(this);
		checkboxMenuItem[2].addItemListener(this);
		
		setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		textArea.setText("");
		if(checkboxMenuItem[0].getState() == true) {
			textArea.append(checkboxMenuItem[0].getLabel() + ";\n");
		}
		if(checkboxMenuItem[1].getState() == true) {
			textArea.append(checkboxMenuItem[1].getLabel() + ";\n");
		}
		if(checkboxMenuItem[2].getState() == true) {
			textArea.append(checkboxMenuItem[2].getLabel() + ";\n");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
