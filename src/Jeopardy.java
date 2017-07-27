
// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener, KeyListener {
	private JButton firstButton1;
	private JButton secondButton1;
	private JButton thirdButton1, fourthButton1, fifthButton1, sixthButton1;

	private JPanel quizPanel1;
	private JPanel quizPanel2;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel1 = new JPanel();
		frame.setLayout(new BorderLayout());
		quizPanel2 = new JPanel();
		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Jeopardy");
		// 3. Create a JPanel variable to hold the header using the createHeader
		// method
		JPanel Dinosaurs = new JPanel();
		Dinosaurs = createHeader("Dinosaurs");
		JPanel Population = new JPanel();
		Population = createHeader("Population");
		// 4. Add the header component to the quizPanel
		quizPanel1.add(Dinosaurs);
		quizPanel2.add(Population);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel1);
		// frame.add(quizPanel2);
		// 6. Use the createButton method to set the value of firstButton1
		firstButton1 = createButton("$100");
		// 7. Add the firstButton1 to the quizPanel
		quizPanel1.add(firstButton1);
		// 8. Write the code inside the createButton() method below. Check that
		// your game looks like Figure 1 in the Jeopardy Handout -
		// http://bit.ly/1bvnvd4.

		// 9. Use the secondButton1 variable to hold a button using the
		// createButton method
		secondButton1 = createButton("$200");
		// 10. Add the secondButton1 to the quizPanel
		quizPanel1.add(secondButton1);

		thirdButton1 = createButton("$400");
		quizPanel1.add(thirdButton1);
		fourthButton1 = createButton("$600");
		quizPanel1.add(fourthButton1);
		fifthButton1 = createButton("$800");
		quizPanel1.add(fifthButton1);
		sixthButton1 = createButton("$1000");
		quizPanel1.add(sixthButton1);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton1.addActionListener(this);
		secondButton1.addActionListener(this);
		thirdButton1.addActionListener(this);
		fourthButton1.addActionListener(this);
		fifthButton1.addActionListener(this);
		sixthButton1.addActionListener(this);
		playJeopardyTheme();

		// 12. Fill in the actionPerformed() method below

		frame.pack();
		quizPanel1.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/*
	 * 13. Use the method provided to play the Jeopardy theme music
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000
	 * questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a
	 * question
	 */

	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton oneh = new JButton();
		// Set the text of the button to the dollarAmount
		oneh.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount += 1;
		// Return your new button instead of the temporary button

		return new JButton(dollarAmount);
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:

		// Use the method that plays the jeopardy theme music.
		playJeopardyTheme();

		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton1
		if (buttonPressed == (firstButton1)) {
			// Call the askQuestion() method
			askQuestion("What was the largest dinosaur?", "Argentinosaurus huinculensis", 100);
			// Fill in the askQuestion() method. When you play the game, the
			// score should change.
		}
		// Or if the buttonPressed was the secondButton1
		else if (buttonPressed == (secondButton1)) {

			// Call the askQuestion() method with a harder question
			askQuestion("What was the largest sea dinosaur?", "Ichthyosaur", 200);
		} else if (buttonPressed == (thirdButton1)) {
			askQuestion("What was the heaviest dinosaur?", "Brachiosaurus", 400);
		} else if (buttonPressed == (fourthButton1)) {
			askQuestion("What was the most dangerous dinosaur?", "Spinosaurus", 600);
		} else if (buttonPressed == (fifthButton1)) {
			askQuestion("What was the smallest dinosaur?", "Compsognathus", 800);
		} else if (buttonPressed == (sixthButton1)) {
			askQuestion("What was the largest flying dinosaur?", "Quetzalcoatlus", 1000);
		}

		// Clear the button text (set the button text to nothing)
		buttonPressed.setText("");
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message

		// Use a pop up to ask the user the question
		String q1 = JOptionPane.showInputDialog(question);
		// If the answer is correct
		if (q1.equals(correctAnswer)) {
			// Increase the score by the prizeMoney
			score += prizeMoney;
			// Call the updateScore() method
			updateScore();
			// Pop up a message to tell the user they were correct
			JOptionPane.showMessageDialog(null, "You are correct!");
		}
		// Otherwise
		else {
			// Decrement the score by the prizeMoney
			score -= prizeMoney;
			// Pop up a message to tell the user the correct answer
			JOptionPane.showMessageDialog(null, "Wrong! The correct answer is Argentinosaurus huinculensis.");
			// Call the updateScore() method
			updateScore();
		}

	}

	public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
