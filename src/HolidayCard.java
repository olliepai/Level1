import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JApplet;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.TurtlePanel;

public class HolidayCard extends MouseAdapter {

	double treeWidth = 15;
	double scale = 1.1; // This is how much the width of the tree grows with each layer

	/* 1. Paste your methods from the Christmas Tree Recipe here. */
	void drawTreeBody() {
		Tortoise.penDown();;
		Tortoise.setSpeed(10);
		// 8. Change the color of the line the tortoise draws to forest green	
		Tortoise.setPenColor(Colors.Greens.ForestGreen);
		// 1. Make a variable for turnAmount and set it to 175
		int turnAmount = 175;
		// 2. Start the Tortoise facing to the right
		Tortoise.turn(90);
		// 5. Repeat steps 3 through 11, 11 times
		for (int i = 0; i < 11; i++) {
			// 3. Move the tortoise the width of the tree
			Tortoise.move(treeWidth);
			// 4. Turn the tortoise the current turnAmount to the right
			Tortoise.turn(turnAmount);
			// 6. Set the treeWidth to the current treeWidth times the scale
			treeWidth = treeWidth * scale;
			// 7. Move the tortoise the width of a tree again
			Tortoise.move(treeWidth);
			// 9. Turn the tortoise the current turn amount to the LEFT
			Tortoise.turn(turnAmount * -1);
			// 10. Set the treeWidth to the current treeWidth times the scale again
			treeWidth = treeWidth * scale;
			// 11. Decrease turnAmount by 1
			turnAmount -= 1;
		}
}
	
	void drawTreeTrunk() {
		Tortoise.setSpeed(10);
		// 1. Move the tortoise half the width of the tree
		Tortoise.move(treeWidth/2);
		// 2. Change the tortoise so that it is pointing straight down
		Tortoise.turn(90);
		// 4. Set the pen width to the tree width divided by 10
		Tortoise.setPenWidth(treeWidth/10);
		// 5. Change the color of the line the tortoise draws to brown
		Tortoise.setPenColor(Colors.Browns.Brown);
		// 3. Move the tortoise a quarter the tree width
		Tortoise.move(treeWidth/4);
	}
	
	void drawStar() {
		// * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
		Tortoise.setSpeed(10);
		Tortoise.turn(17);
		for (int i = 0; i < 5; i++) {
			Tortoise.setPenColor(Color.red);
			Tortoise.move(20);
			Tortoise.turn(144);
		}
		Tortoise.turn(-17);
		Tortoise.turn(90);
		Tortoise.penUp();
		//Tortoise.move(5);
		Tortoise.turn(-90);
	}

	/* 2. When the mouse is clicked draw a tree at that position. */
	public void mouseClicked(MouseEvent mouseEvent) {
		System.out.println("mouse clicked!");

		int mouseX = mouseEvent.getX();
		int mouseY = mouseEvent.getY();
		// Set the X position of the Tortoise to the X position of the mouse
		Tortoise.setX(mouseX);
		Tortoise.setY(mouseY);
		
		drawTree();
	}

	/* 3. Personalize your card. */
	void drawGreetingAndSing() {
		// Download a Christmas sound (wav, midi or aiff) and use the playMusic() method to play it
		playMusic("Christmas.wav");
		// Use the writeGreeting() method to add a festive message
		writeGreeting("hO Ho hO\nMeRy ChRiStMaS eVeRyOnE");
	}

	private void writeGreeting(String greeting) {
		tortoiseWindow.getGraphics().drawString(greeting, 175, 70);
	}

	private void playMusic(String nameOfSoundFile) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(nameOfSoundFile));
		sound.play();
	}

	void drawTree() {
		drawStar();
		drawTreeBody();
		drawTreeTrunk();
		treeWidth = 15;
		Tortoise.setAngle(0);
		Tortoise.setPenWidth(treeWidth/5);
	}

	public static void main(String[] args) {
		new HolidayCard();
	}

	TurtlePanel tortoiseWindow;

	HolidayCard() {
		tortoiseWindow = Tortoise.getBackgroundWindow();
		tortoiseWindow.addMouseListener(this);
		Tortoise.show();
		Tortoise.setSpeed(10);
		drawGreetingAndSing();
	}
}



