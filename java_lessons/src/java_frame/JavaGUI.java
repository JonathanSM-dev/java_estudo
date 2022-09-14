package java_frame;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JavaGUI {

	public static void main(String[] args) {
	// JFrame = a GUI window to add components to
		  
	JFrame frame = new JFrame(); //creates a invisible frame
	frame.setTitle("Java Warrior"); //sets title of frame
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application when X is pressed // It's just hided by default
	frame.setResizable(true); //prevent frame from being resized if marked as "‎false"
	frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame
	frame.setVisible(true); //make frame visible
		  
	ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon
	frame.setIconImage(image.getImage()); //change icon of frame
	frame.getContentPane().setBackground(new Color(0x123456)); //change color of background
		    
	}

}
