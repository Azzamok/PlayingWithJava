package main;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class GUI extends JFrame {
	
	private JLabel item1;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;
	private JPasswordField pw;
	private JButton clickMe;
	private JButton customButton;
	private JCheckBox boldBox;
	private JCheckBox italicsBox;
	
	public GUI() {
		super("My noob GUI");
		setLayout(new FlowLayout());
		
		clickMe = new JButton("Click Me!");
		add(clickMe);
		
		Icon twitter = new ImageIcon(getClass().getResource("twitter.png"));
		Icon yt = new ImageIcon(getClass().getResource("yt.png"));
		customButton = new JButton("Custom button", twitter);
		customButton.setRolloverIcon(yt);
		add(customButton);
		
		item1 = new JLabel("Label here...");
		item1.setToolTipText("Tool tip text when you hover over it.");
		add(item1);
		
		text1 = new JTextField(10);
		text1.setFont(new Font("Serif", Font.PLAIN, 14));
		add(text1);
		
		boldBox = new JCheckBox("bold");
		italicsBox = new JCheckBox("italic");
		add(boldBox);
		add(italicsBox);
		
		text2 = new JTextField("Enter text here.");
		add(text2);
		
		text3 = new JTextField("Cannot change this", 20);
		text3.setEditable(false);
		add(text3);
		
		pw = new JPasswordField("mypass");
		add(pw);
		
		
		Handler handler = new Handler();
		text1.addActionListener(handler);
		text2.addActionListener(handler);
		text3.addActionListener(handler);
		pw.addActionListener(handler);
		clickMe.addActionListener(handler);
		customButton.addActionListener(handler);
		
		ItemHandler itemHandler = new ItemHandler();
		boldBox.addItemListener(itemHandler);
		italicsBox.addItemListener(itemHandler);
		
	}
	
	private class Handler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if(event.getSource() == text1) {
				string = String.format("Field 1: %s", event.getActionCommand());
			}
			else if(event.getSource() == text2) {
				string = String.format("Field 2: %s", event.getActionCommand());
			}
			else if(event.getSource() == text3) {
				string = String.format("Field 3: %s", event.getActionCommand());
			}
			else if(event.getSource() == pw) {
				string = String.format("Password: %s", event.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()));
		}
	}
	
	private class ItemHandler implements ItemListener {

		public void itemStateChanged(ItemEvent event) {
			Font font = null;
			
			if(boldBox.isSelected() && italicsBox.isSelected()) {
				font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
			}
			else if(boldBox.isSelected()) {
				font = new Font("Serif", Font.BOLD, 14);
			}
			else if(italicsBox.isSelected()) {
				font = new Font("Serif", Font.ITALIC, 14);
			}
			else {
				font = new Font("Serif", Font.PLAIN, 14);
			}
			text1.setFont(font);
		}
		
	}
}
