package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binary_converter implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textField = new JTextField(20);
	JButton button = new JButton("convert");
	JLabel label = new JLabel();
	
	public static void main(String[] args) {
		binary_converter converter = new binary_converter();
		converter.createUI();
	}
	public void createUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		button.addActionListener(this);		
		panel.add(textField);
		panel.add(button);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String binary = textField.getText();
		String convertedValue = convert(binary);
		label.setText(convertedValue);
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
 }
