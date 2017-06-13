import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
	
	public static void main(String[] args) {
		TypingTutor tutor = new TypingTutor();
		tutor.UI();
		
		
	}
	
	public void UI() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		char currentLetter = generateRandomLetter();
		JLabel label = new JLabel();
		label.setText(currentLetter + " ");
		frame.add(label);
		frame.pack();
	}
	
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

}
