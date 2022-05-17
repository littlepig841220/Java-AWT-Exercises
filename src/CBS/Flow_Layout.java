package CBS;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Window;

public class Flow_Layout extends Frame{
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		/*FlowLayout flowLayout = new FlowLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setHgap(1);
		flowLayout.setVgap(1);
		System.out.println(flowLayout.getAlignment() + "\n" + flowLayout.getHgap() + "\n" + flowLayout.getVgap());*/
		new Flow_Layout();
	}

	public Flow_Layout() {
		setSize(100,100);
		setLayout(new FlowLayout());
		//or
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		//setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));//(int align,int hgap,int vgap)
		
		add(new Button("Button1"));
		add(new Button("Button2"));
		add(new Button("Button3"));
		add(new Button("Button4"));
		add(new Button("Button5"));
		add(new Button("Button6"));
		
		Font font = new Font("arial", Font.BOLD, 25);
		
		Label label = new Label("test");
		Label label2 = new Label("test");
		
		label2.setFont(font);
		
		add(label);
		add(label2);
		add(new Label("test"));
		
		remove(0);
		remove(label);
		//removeAll();
		
		pack();
		
		setVisible(true);
	}
}
