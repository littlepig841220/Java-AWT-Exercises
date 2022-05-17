package CBS;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class Grid_Layout extends Frame{

	public static void main(String[] args) {
		new Grid_Layout();
		
		/*GridLayout gridLayout = new GridLayout();
		gridLayout.setColumns(3);
		gridLayout.setRows(2);
		gridLayout.setHgap(5);
		gridLayout.setVgap(5);
		System.out.println(gridLayout.getColumns() + "\n" + gridLayout.getRows() + "\n" + gridLayout.getHgap() + "\n" + gridLayout.getVgap());
		gridLayout.addLayoutComponent("test", new Label("test"));*/
	}
	
	public Grid_Layout() {
		setSize(100, 100);
		setLayout(new GridLayout(3,2));
		//or
		//setLayout(new GridLayout(3, 2, 1, 1));
		
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Button("5"));
		
		setVisible(true);
	}
}