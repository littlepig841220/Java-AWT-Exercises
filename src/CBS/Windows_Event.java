package CBS;

import java.awt.Component;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Windows_Event extends Frame implements WindowListener{
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		Windows_Event windows_Event = new Windows_Event();
		windows_Event.addWindowListener(windows_Event);
		windows_Event.setBounds(120, 120, 240, 240);
		windows_Event.setVisible(true);
	}
	
	public void windowClosing(WindowEvent e) {
		System.out.println("Windows closing");
		System.exit(0);
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("Windows open");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("Windows closed");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("Windows iconified");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("Windows reduction");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("Get Windows control");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Lose Windows control");
	}
}
