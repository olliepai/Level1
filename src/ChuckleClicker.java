import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener{
	JButton button;
	JButton button2;
	
	public void makeButtons() {
		JFrame frame = new JFrame();
		frame.setSize(200, 60);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		button = new JButton();
		button2 = new JButton();
		panel.add(button);
		panel.add(button2);
		button.setText("joke");
		button2.setText("punchline");
		button.addActionListener(this);
		button2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(button)) {
			JOptionPane.showMessageDialog(null, "Hi.");
			JOptionPane.showMessageDialog(null, "What animal should you never play cards with?");
		}
		else {
			JOptionPane.showMessageDialog(null, "A cheetah.");
		}
	}
	
	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();

	}

}
