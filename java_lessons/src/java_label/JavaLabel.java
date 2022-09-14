package java_label;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class JavaLabel {

	public static void main(String[] args) {

	// JLabel = a GUI display area for a string of text, an image, or both
		
	ImageIcon image = new ImageIcon("dude.png");
	ImageIcon icon = new ImageIcon("logo.png");
		
	Border border = BorderFactory.createLineBorder(Color.green,3);
		
	JLabel label = new JLabel(); //create a label
	label.setText("Java Warrior"); //set label text
	label.setIcon(image);
	label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageIcon
	label.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageIcon
	label.setForeground(new Color(0x000000)); //set font color of text
	label.setFont(new Font("Miriam Mono CLM",Font.PLAIN,100)); //set font of text
	label.setIconTextGap(-25); //set gap of text to image
	label.setBackground(Color.white); //set background color
	label.setOpaque(true); //display background color
	//label.setBorder(border); //sets border of label (not image+text)
	label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within- label
	label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
	//label.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions
		
	JFrame frame = new JFrame();	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setIconImage(icon.getImage());
	//frame.setSize(500,500);
	//frame.setLayout(null);
	frame.setVisible(true);	 
	frame.add(label);
	frame.pack();//adjust the size of the elements of the label
	}
} 