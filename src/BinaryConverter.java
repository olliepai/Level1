import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JButton button;
	JTextField question;
	JTextField answer;

	public static void main(String[] args) {
		BinaryConverter converter = new BinaryConverter();
		converter.frame();
	}

	public void frame() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);
		question = new JTextField(20);
		panel.add(question);
		button = new JButton();
		button.setText("Convert");
		panel.add(button);
		button.addActionListener(this);
		answer = new JTextField(20);
		panel.add(answer);
		frame.pack();

	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(button)) {
			String q = question.getText();
			String conv = convert(q);
			answer.setText(conv);
			System.out.println(conv);
		}
	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;
	}
}
