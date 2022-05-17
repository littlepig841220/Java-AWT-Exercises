package CBS;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileDialog_example extends Frame implements ActionListener{
	private static final long serialVersionUID = 1L;
	private FileDialog fileDialogLoaDialog = new FileDialog(this, "Open", FileDialog.LOAD);
	private FileDialog fileDialogSave = new FileDialog(this, "Save", FileDialog.SAVE);
	private MenuItem menuItem = new MenuItem("Open");
	private MenuItem menuItem2 = new MenuItem("Save");

	public static void main(String[] args) {
		new FileDialog_example();
	}
	
	public FileDialog_example() {
		setSize(250, 200);
		setTitle("FileDialog example");
		setBackground(Color.LIGHT_GRAY);
		
		MenuBar menuBar = new MenuBar();
		Menu menu = new Menu("Start");
		
		menuBar.add(menu);
		menu.add(menuItem);
		menu.add(menuItem2);
		
		menuItem.addActionListener(this);
		menuItem2.addActionListener(this);
		
		setMenuBar(menuBar);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Open")) {
			fileDialogLoaDialog.setVisible(true);
		}else if(e.getActionCommand().equals("Save")) {
			fileDialogSave.setVisible(true);
		}
	}

}
