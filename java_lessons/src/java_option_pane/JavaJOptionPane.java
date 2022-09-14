package java_option_pane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JavaJOptionPane {

	public static void main(String[] args) {
		// JOptionPane = Pop up a standard dialog box that prompts users for a value
		//				 or informs them of something
		
		
		//JOptionPane.showMessageDialog(null, "This is a useless info", "Plain Message", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is a useless info!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Is this a useless info?", "Question Message", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is a useless warning!!!", "Warning Message", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "This is a useless error!!!!!!!", "Error Message", JOptionPane.ERROR_MESSAGE);
		
		
		//Just for fun:
		//while(true) {
			//JOptionPane.showMessageDialog(null, "This is a useless info", "Plain Message", JOptionPane.PLAIN_MESSAGE);
			//JOptionPane.showMessageDialog(null, "This is a useless info!", "Information Message", JOptionPane.INFORMATION_MESSAGE);
			//JOptionPane.showMessageDialog(null, "Is this a useless info?", "Question Message", JOptionPane.QUESTION_MESSAGE);
			//JOptionPane.showMessageDialog(null, "This is a useless warning!!!", "Warning Message", JOptionPane.WARNING_MESSAGE);
			//JOptionPane.showMessageDialog(null, "This is a useless error!!!!!!!", "Error Message", JOptionPane.ERROR_MESSAGE);
		//}
		
		//The sysout inform to me what int will return in each option of the dialog
		//System.out.println(JOptionPane.showConfirmDialog(null, "Confirm Dialog?", "This is a confirm Dialog", JOptionPane.YES_NO_CANCEL_OPTION));
		
		//String name = JOptionPane.showInputDialog("What is your name?");
		//System.out.println("Hello " + name);
		String[] responses = {"No, you're awesome!", "thank you!", "*blush*"};
		ImageIcon icon = new ImageIcon("logo.png");
		JOptionPane.showOptionDialog(null, 
				"You are awesome!", 
				"secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0);
	}
}
