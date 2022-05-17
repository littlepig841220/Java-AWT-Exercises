package CBS;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key_Event3 implements KeyListener{
	private static String message = "";

	public static void main(String[] args) {
		Key_Event3 key_Event3 = new Key_Event3();
	}
	
	public Key_Event3() {
		Frame frame = new Frame("Key Even");
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(message.length() <= 5) {
			message += e.getKeyChar();
			System.out.println("Typed:" + message);
		}else {
			System.out.println("Press the ESC to reset.");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed the Keyboard");
		int key_code = e.getKeyCode();
		int key_location = e.getKeyLocation();
		char key_char = e.getKeyChar();
		String key2 = e.getKeyModifiersText(key_code);
		String key = e.getKeyText(key_code);
		
		System.out.println("Key code:" + key_code + 
				"\nKey location:" + key_location + 
				"\nKey Char:" + key_char + 
				"\nKey Modifiers(deprecated):" + key2 + 
				"\nKey Text:" + key + 
				"\n");
		
		if(key_code == KeyEvent.VK_ESCAPE) {
			message = "";
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Released the Keyboard");
	}

}
