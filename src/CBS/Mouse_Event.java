package CBS;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Mouse_Event extends Frame implements MouseListener{

	public static void main(String[] args) {
		Mouse_Event mouse_Event = new Mouse_Event();
		mouse_Event.addMouseListener(mouse_Event);
		mouse_Event.addMouseWheelListener(mouseWheelListener);
		mouse_Event.addMouseMotionListener(mouseMotionListener);
		mouse_Event.setBounds(120, 120, 240, 240);
		mouse_Event.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		switch(e.getButton()) {
			case MouseEvent.BUTTON1 : {
				System.out.println("Left Click!");
				break;
			}
			case MouseEvent.BUTTON2 : {
				System.out.println("Middle Click!");
				break;
			}
			case MouseEvent.BUTTON3 : {
				System.out.println("Right Click!");
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("The Mouse is pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("The Mouse is released");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("The Mouse is entered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("The Mouse is exited");
	}
	
	private static MouseWheelListener mouseWheelListener = new MouseWheelListener() {
		
		@Override
		public void mouseWheelMoved(MouseWheelEvent e) {
			int notches = e.getWheelRotation();
			
			if (notches < 0) {
				System.out.println("Mouse wheel moved UP " + -notches + " notch(es)");
		    } else {
		    	System.out.println("Mouse wheel moved DOWN " + notches + " notch(es)");
		    }
		}
	};
	
	private static MouseMotionListener mouseMotionListener = new MouseMotionListener() {
		int i = 0;
		@Override
		public void mouseMoved(MouseEvent e) {
			System.out.println(i);
			i++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		@Override
		public void mouseDragged(MouseEvent e) {
			System.out.println(i);
			i--;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	};
}
