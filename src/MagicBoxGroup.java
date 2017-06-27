import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;



public class MagicBoxGroup extends JPanel implements Runnable, MouseListener {

	/*
	 * Work together as a TEAM of 2 or 3 to make this project. We are going to hide secrets within the magic box. 
	 * When the user clicks on a secret place, stuff will happen.
	 * 
	 * 1. Make the frame respond to mouse clicks.
	 * 
	 * 2. When the mouse is clicked, use the Media Palace (bit.ly/media-palace) to play sounds, show images or speak.
	 * 
	 * 3. backgroundImage.getRGB(keyEvent.getX(), keyEvent.getY()) will give you the color of the current pixel.
	 */

	BufferedImage backgroundImage;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new MagicBox());
	
	}

	@Override
	public void run() {
		try {
			loadBackgroundImage();
			createUI();
		} catch (Exception w) {
			System.err.println(w.getMessage());
		}
	}

	private void createUI() {
		JFrame frame = new JFrame("The Magic Box contains many secrets...");
		frame.add(this);
		frame.addMouseListener(this);
		JPanel panel = new JPanel();
		frame.add(panel);
		JLabel Jay1 = new JLabel();
		Jay1.setBounds(738, 500, 2, 2);
		Jay1.setOpaque(true);
		Jay1.setBackground(Color.darkGray);
		JLabel Jay2 = new JLabel();
		Jay2.setBounds(146, 500, 2, 2);
		Jay2.setOpaque(true);
        Jay2.setBackground(Color.YELLOW);
        JLabel Jay3 = new JLabel();
        Jay3.setBounds(197, 185, 2, 2);
        Jay3.setOpaque(true);
        frame.setBackground(Color.WHITE);
        Jay3.setBackground(Color.BLUE);
        JLabel Jay4= new JLabel();
        Jay4.setBounds(136, 724, 2, 2);
		setPreferredSize(new Dimension(backgroundImage.getWidth(), backgroundImage.getHeight()));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	
	}

	private void loadBackgroundImage() throws Exception {
		String imageFile = "/Users/league/Google Drive/league-images/magic-box.jpg";
		try {
			backgroundImage = ImageIO.read(new File(imageFile));
		} catch (IOException e) {
			throw new Exception("Could not load image: " + imageFile);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println(e.getX() + " , "+e.getY());
	
		if(e.getX()==738&&e.getY()==500){
		speak("u win");
		}
		else if(e.getX()==146&&e.getY()==500){
			speak("u win");
		}
		else if(e.getX()==197&&e.getY()==185){
			speak("U lose sorry");
		}
		else if(e.getX()==136&&e.getY()==724){
			speak("U lose sorry");
		}
		else{
			speak("Keep Going Mate, you suck");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
