import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PracticeUI {
	public static void main(String[] args) {
		PracticeUI ui = new PracticeUI();
		ui.ui();
	}

	public void ui() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button1 = new JButton();
		button1.setText("pants");
		panel.add(button1);
		JButton button2 = new JButton();
		button2.setText("pants1");
		panel.add(button2);
		frame.pack();
	}
}
