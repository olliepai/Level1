 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		int score = 0;
		// 1. find an image on the Internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String aa  = "https://resizing.flixster.com/9fliFjUFxsCvAuTO-jX8XwiGBFs=/300x300/v1.aDszNTEwO2o7MTcxOTA7MTIwMDs3MDA7Mzk2";
		// 2. create a variable of type "Component" that will hold your image
		Component oo = createImage(aa);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(oo);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String ans = JOptionPane.showInputDialog("Who is this???");
		// 7. print "CORRECT" if the user gave the right answer
		if (ans.equals("King Kong") || ans.equals("king kong") || ans.equals("kingkong")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "CORRECT\nScore: " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT\nScore: " + score);
		}
		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(oo);
		// 10. find another image and create it (might take more than one line of code)
		String bb = "http://www.analyzemath.com/practice_tests/sat_subject/graphs_1/sat_sub_1.gif";
		Component pp = createImage(bb);
		// 11. add the second image to the quiz window
		quizWindow.add(pp);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String math = JOptionPane.showInputDialog("What is the measure of angle ADC?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (math.equals("55")) {
			score += 1;
			JOptionPane.showMessageDialog(null, "CORRECT\nScore: " + score);
		}
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT\nScore: " + score);
		}


	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}






