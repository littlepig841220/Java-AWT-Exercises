package CBS;

import java.awt.Color;
import java.awt.Frame;

public class Basic {
	
	public static void main(String[] args) {
		Frame frame = new Frame("Basic");
		//or
		//frame.setTitle("test2");
		System.out.println(frame.getTitle());
		
		frame.setState(Frame.NORMAL);
		System.out.println(frame.getState());
		
		frame.setResizable(false);
		
		frame.setBackground(Color.PINK);
		
		frame.setForeground(Color.WHITE);
		
		frame.setLocation(500, 500);
		
		frame.setSize(300, 200);
		frame.setVisible(true);
		
		System.out.println(frame.isShowing());
		frame.toFront();
		//toBack();
	}

}
