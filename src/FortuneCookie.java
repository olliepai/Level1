import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{
	JButton butt;
	
	public static void main(String[] args) {
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();		
	}
	
	public void showButton() {
		JOptionPane.showMessageDialog(null, "MESSAGE!");
		JFrame jFrame = new JFrame();
		jFrame.setVisible(true);
		butt = new JButton();
		jFrame.add(butt);
		butt.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(butt)) {
			JOptionPane.showMessageDialog(null, "Woohoo.");
			int x = new Random().nextInt(5);
			if (x == 0) {
				JOptionPane.showMessageDialog(null, "You will die tomorrow");
			}
			if (x == 1) {
				JOptionPane.showMessageDialog(null, "You will die in two hours");
			}
			if (x == 2) {
				JOptionPane.showMessageDialog(null, "You will die in a week");
			}
			if (x == 3) {
				JOptionPane.showMessageDialog(null, "You will die in a month");
			}
			if (x == 4) {
				JOptionPane.showMessageDialog(null, "You will die in a year");
			}
		}
	}
	

}
