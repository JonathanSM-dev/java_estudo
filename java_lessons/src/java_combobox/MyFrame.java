package java_combobox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JComboBox comboBox;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"cat", "dog", "bird"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true);//Você poderá editar o texto
		//System.out.println(comboBox.getItemCount());//Print the current amount of items 
		//comboBox.addItem("horse");
		comboBox.insertItemAt("pig", 0);
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			//System.out.println(comboBox.getSelectedIndex()); // Returns the position/number of the option 
		}
		
	}

}
