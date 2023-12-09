package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JButton button= new JButton();
	JTextField text= new JTextField(20);
	public void ShowButton() {
		System.out.println("Button clicked");
		JFrame frame= new JFrame("Convert 8 bits of binary to ASCII");
		frame.setVisible(true);
		JPanel panel= new JPanel();
		frame.add(panel);
		button.addActionListener(this);
		panel.add(button);
		JLabel label= new JLabel("convert");
		button.add(label);
		panel.add(text);
		frame.pack();
		
		

	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed==button) {
			String answer = text.getText();
			convert(answer);
		}
		
		
	}
}
