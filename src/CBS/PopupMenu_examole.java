package CBS;

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenu_examole extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private static String color[] = {"Blue","Pink"};
	private static Label label = new Label("");
	private static PopupMenu popupMenu = new PopupMenu("Change color");
	private static MenuItem menuItem[] = new MenuItem[color.length];

	public static void main(String[] args) {
		new PopupMenu_examole();
	}
	
	public PopupMenu_examole() {
		setSize(200,200);
		setTitle("PopupMenu example");
		setBackground(Color.CYAN);
		setResizable(false);
		
		for(int a = 0;a < color.length;a++) {
			menuItem[a] = new MenuItem(color[a]);
			popupMenu.add(menuItem[a]);
			menuItem[a].addActionListener(this);
		}
		
		label.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON3) {
					if(label.getBackground() == Color.CYAN) {
						menuItem[0].setEnabled(false);
						menuItem[1].setEnabled(true);
					}else {
						menuItem[0].setEnabled(true);
						menuItem[1].setEnabled(false);
					}
					popupMenu.show(label, e.getX(), e.getY());
				}
			}
		});
		
		add(popupMenu);
		add(label);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Blue")) {
			label.setBackground(Color.CYAN);
		}else if(e.getActionCommand().equals("Pink")) {
			label.setBackground(Color.PINK);
		}
	}

}
