package CBS;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Border_Layout extends Frame{

	public static void main(String[] args) {
		new Border_Layout();
		
		/*BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(1);
		borderLayout.setVgap(1);
		System.out.println(borderLayout.getHgap() + "\n" + borderLayout.getVgap());*/
	}

	public Border_Layout() {
		setSize(100, 100);
		//setLayout(new BorderLayout());
		//or
		setLayout(new BorderLayout(0, 5));
		
		add(new Button("East"),BorderLayout.EAST);
		add(new Button("West"),BorderLayout.WEST);
		add(new Button("South"),BorderLayout.SOUTH);
		add(new Button("North"),BorderLayout.NORTH);
		add(new Button("Center"),BorderLayout.CENTER);
		
		pack();
		
		setVisible(true);
	}
}
