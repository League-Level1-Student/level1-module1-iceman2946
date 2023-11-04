package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		String NumberofMinutes= JOptionPane.showInputDialog("How many minutes do you want your popcorn to be cooked?");
		int minutes= Integer.parseInt(NumberofMinutes);
		String flavor= JOptionPane.showInputDialog("What flavor do you want your popcorn?");
		Popcorn popcorn= new Popcorn(flavor);
		microwave.putInMicrowave(popcorn);
		microwave.setTime(minutes);
		
	}
}
