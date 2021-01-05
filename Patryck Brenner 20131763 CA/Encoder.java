/*
 *Encoder.java
 *@Patryck Brenner
 *2nd of Dec 2020
*/

public class Encoder{
	//Variables
	private String sentence, newSentence;
	private StringBuffer strBuff;

	//Constructor
	public Encoder(){
		sentence = "";
		newSentence = "";
		strBuff = new StringBuffer();
	}

	//Set methods
	public void setSentence(String sentence){
		this.sentence = sentence;
	}

	public void setNewSentence(String newSentence){
		this.newSentence = newSentence;
	}

	//Compute method
	public void compute(){
		sentence = sentence.toLowerCase();
		for(int i = 0; i < sentence.length(); i++){
			if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u'){
				strBuff.append(sentence.charAt(i));
				strBuff.append(i + 1);
			} else if(sentence.charAt(i) == ' '){
				strBuff.append('+');
			} else if (sentence.charAt(i) == '.'){
				strBuff.append('!');
			} else if (sentence.charAt(i) == '?'){
				strBuff.append("??");
			} else if (sentence.charAt(i) == '!'){
				strBuff.append("?!");
			} else {
			strBuff.append(sentence.charAt(i));
			}
			newSentence = strBuff.toString();
		}



	}

	//Get methods
	public String getNewSentence(){
		return newSentence;
	}

}