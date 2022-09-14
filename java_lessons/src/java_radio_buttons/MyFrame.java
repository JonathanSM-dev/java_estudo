package java_radio_buttons;

import java.awt.*;
import java.awt.event.*;


import javax.swing.*;


public class MyFrame extends JFrame implements ActionListener {
	
	JRadioButton pizzaButton;
	JRadioButton hamburguerButton;
	JRadioButton hotdogButton;
	
	ImageIcon pizzaIcon;
	ImageIcon hamburguerIcon;
	ImageIcon hotdogIcon;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		
		pizzaIcon = new ImageIcon("pizza.png");
		hamburguerIcon = new ImageIcon("hamburguer.png");
		hotdogIcon = new ImageIcon("hot-dog.png");
		
		pizzaButton = new JRadioButton("pizza");
		hamburguerButton = new JRadioButton("hamburguer");
		hotdogButton = new JRadioButton("hotdog");
		
		pizzaButton.setIcon(pizzaIcon);
		hamburguerButton.setIcon(hamburguerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		
		ButtonGroup group = new ButtonGroup();
		group.add(hamburguerButton);
		group.add(hotdogButton);
		group.add(pizzaButton);
		
		pizzaButton.addActionListener(this);
		hamburguerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		this.add(pizzaButton);
		this.add(hamburguerButton);
		this.add(hotdogButton);	
		this.pack();
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== pizzaButton) {
			System.out.println("I love pizza");
			
		}
		else if(e.getSource()==hamburguerButton) {
			System.out.println("I love hamburguer");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("I love hotdog");
		}
		
		
	}
 		
}
