package main;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class Main {

	public static void main(String[] args) {
		/*
		System.out.println("Type in some stuff");
		Scanner in = new Scanner(System.in);
		System.out.println(in.nextLine());
		in.close();
		*/
		
		//Arrays
		//int[] arr = new int[3];
		int arr[] = new int[5];
		String asdf[] = new String[22];
		arr[0] = 21;
		asdf[2] = "blah";

		//GUI TIME
		GUI myGUI = new GUI();
		
		myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myGUI.setSize(640, 480);
		myGUI.setVisible(true);
		
		
		String fn = JOptionPane.showInputDialog("Enter your first number."); //prompt
		
		int num = Integer.parseInt(fn);
		JOptionPane.showMessageDialog(null, "Hi, you have typed in " + num, "the title", JOptionPane.PLAIN_MESSAGE);
		
		
	}

}
