package _04_secret_message_box;

import javax.swing.JOptionPane;

public class secretmessage {
	public static void main(String[] args) {
		
		String password = "fn2187";
		
	String l23 = JOptionPane.showInputDialog(null,"WHAT IS THE SECRET MESSAGE");

		
	String  TTT= JOptionPane.showInputDialog(null,"WHAT IS THE PASSWORD TO SEE YOUR MESSAGE");
		
		
	if (TTT.equals(password)) {
			
		 JOptionPane.showMessageDialog(null,l23);
		}
	else {
		
		 JOptionPane.showMessageDialog(null,"INTRUDER");
		
	}
	
	
	}
}
