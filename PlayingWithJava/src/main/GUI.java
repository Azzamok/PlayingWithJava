package main;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;


public class GUI extends JFrame {
	
	private JLabel item1;
	
	public GUI() {
		super("Title bar");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("Label here...");
		item1.setToolTipText("Tool tip text when you hover over it.");
		add(item1);
	}

}
