package java_menubar;

import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	ImageIcon saveIcon;
	ImageIcon loadIcon;
	ImageIcon exitIcon;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		saveIcon = new ImageIcon("save.png");
		loadIcon = new ImageIcon("load.png");
		exitIcon = new ImageIcon("exit.png");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		//For JMenu we need alt + letter
		fileMenu.setMnemonic(KeyEvent.VK_F); //Alt + f for file
		editMenu.setMnemonic(KeyEvent.VK_E);	
		helpMenu.setMnemonic(KeyEvent.VK_H);
		
		//For JMenuItem we need just the letter
		loadItem.setMnemonic(KeyEvent.VK_L); //l for load
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		menuBar.add(helpMenu);
		menuBar.add(editMenu);
		menuBar.add(fileMenu);
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		
		
		
		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == loadItem) {
			System.out.println("*beep boop* you've loaded a file");
		}
		else if(e.getSource() == saveItem) {
			System.out.println("*beep boop* you've saved a file");
		}
		else if(e.getSource() == exitItem) {
			System.exit(0);
		}
		
	}

}
