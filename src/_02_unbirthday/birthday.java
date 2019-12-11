package _02_unbirthday;

import javax.swing.JOptionPane;

public class birthday {
public static void main(String[] args) {
	

String day=JOptionPane.showInputDialog(null, "When is your birthday (mm/dd)");

if (day.equals("1111")) {
	JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");
}
	
	else JOptionPane.showMessageDialog(null, "HAPPY UNBIRTHDAY");











}
}