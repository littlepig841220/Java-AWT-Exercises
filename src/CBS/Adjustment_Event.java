package CBS;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Adjustment_Event extends Frame implements AdjustmentListener{
	private static final long serialVersionUID = 1L;
	private Scrollbar scrollbarV,scrollbarH;
	private Label label,label2;
	
	public static void main(String[] args) {
		new Adjustment_Event();
	}
	
	public Adjustment_Event() {
		setTitle("Adjustment Event");
		setLayout(new BorderLayout());
		setBounds(120, 120, 240, 240);
		
		scrollbarV = new Scrollbar(Scrollbar.VERTICAL);
		scrollbarH = new Scrollbar(Scrollbar.HORIZONTAL);
		label = new Label("The value from scrollbarV: 0");
		label2 = new Label("The value from scrollbarH: 0");
		
		scrollbarV.addAdjustmentListener(this);
		scrollbarH.addAdjustmentListener(this);
		
		add(scrollbarV,BorderLayout.EAST);
		add(scrollbarH,BorderLayout.SOUTH);
		add(label,BorderLayout.NORTH);
		add(label2,BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		if(e.getSource().equals(scrollbarV)) {
			label.setText("The value from scrollbarV: 0" + scrollbarV.getValue());
		}else if(e.getSource().equals(scrollbarH)) {
			label2.setText("The value from scrollbarH: 0" + scrollbarH.getValue());
		}
	}

}
