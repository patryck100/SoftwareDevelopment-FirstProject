/*
 *EncoderApp.java
 *@Patryck Brenner
 *2nd of Dec 2020
*/

import javax.swing.JOptionPane;
public class EncoderApp{
	public static void main (String args[]){
		//Variables
		String sentence, newSentence;

		//Objects
		Encoder myCode = new Encoder();

		//Input
		sentence = JOptionPane.showInputDialog(null, "Please enter a sentence with only letters, spaces, dots, exclamation marks and question marks:");
		myCode.setSentence(sentence);

		//Compute
		myCode.compute();

		//Output
		newSentence = myCode.getNewSentence();
		JOptionPane.showMessageDialog(null, newSentence);


	}
}