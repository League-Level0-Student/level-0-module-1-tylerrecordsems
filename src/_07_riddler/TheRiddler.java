package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String A = JOptionPane.showInputDialog(null, "What comes up but never comes down");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (A.equals("age")) {
	JOptionPane.showMessageDialog(null, "Correct");
score = score + 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
 	
else JOptionPane.showMessageDialog(null, "Wrong");

	// 6. Add some more riddles
String B = JOptionPane.showInputDialog(null, "What has a head and tail but no body");{
if (B.equals("penny")) {
	JOptionPane.showMessageDialog(null, "Correct");
	score = score + 1;
}
else JOptionPane.showMessageDialog(null, "Wrong");}

// 2. Make a pop up to show the score.
 JOptionPane.showMessageDialog(null, score);
	}
}

