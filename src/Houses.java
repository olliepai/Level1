import java.awt.Color;
import java.util.Random;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses {
	public static void main(String[] args) {
		Tortoise.getBackgroundWindow().setColor(Color.black);
		Tortoise.setSpeed(10);
		Tortoise.penDown();
		Tortoise.setX(10);
		Tortoise.setY(425);
		for (int i = 0; i < 3600; i++) {
			/*int p = new Random().nextInt(4);
			if (p == 0) {
				Tortoise.getBackgroundWindow().setColor(Color.black);
			}
			if (p == 1) {
				Tortoise.getBackgroundWindow().setColor(Color.red);
			}
			if (p == 2) {
				Tortoise.getBackgroundWindow().setColor(Color.green);
			}
			if (p == 3) {
				Tortoise.getBackgroundWindow().setColor(Color.blue);
			}*/
			if (i == 60) {
				Tortoise.setX(10);
				Tortoise.setY(500);
			}
			if (i == 120) {
				Tortoise.setX(10);
				Tortoise.setY(550);
			}
			if (i == 180) {
				Tortoise.setX(10);
				Tortoise.setY(600);
			}
			if (i == 240) {
				Tortoise.setX(10);
				Tortoise.setY(650);
			}
			if (i == 300) {
				Tortoise.setX(10);
				Tortoise.setY(700);
			}
			if (i == 360) {
				Tortoise.setX(10);
				Tortoise.setY(750);
			}
			if (i == 420) {
				Tortoise.setX(10);
				Tortoise.setY(800);
			}
			if (i == 480) {
				Tortoise.setX(10);
				Tortoise.setY(850);
			}
			if (i == 540) {
				Tortoise.setX(10);
				Tortoise.setY(900);
			}
			if (i == 600) {
				Tortoise.setX(10);
				Tortoise.setY(950);
			}
			if (i == 660) {
				Tortoise.setX(10);
				Tortoise.setY(1000);
			}
			if (i == 720) {
				Tortoise.setX(10);
				Tortoise.setY(400);
			}
			if (i == 780) {
				Tortoise.setX(10);
				Tortoise.setY(350);
			}
			if (i == 840) {
				Tortoise.setX(10);
				Tortoise.setY(300);
			}
			if (i == 900) {
				Tortoise.setX(10);
				Tortoise.setY(250);
			}
			if (i == 960) {
				Tortoise.setX(10);
				Tortoise.setY(200);
			}
			if (i == 1020) {
				Tortoise.setX(10);
				Tortoise.setY(150);
			}
			if (i == 1080) {
				Tortoise.setX(10);
				Tortoise.setY(100);
			}
			if (i == 1140) {
				Tortoise.setX(10);
				Tortoise.setY(50);
			}
			int x = new Random().nextInt(3);
			int y = new Random().nextInt(3);
			int z = new Random().nextInt(2);
			String h = "y";
			String co = "y";
			String ro = "y";
			if (x == 0) {
				h = "small";
			}
			if (x == 1) {
				h = "medium";
			}
			if (x == 2) {
				h = "large";
			}
			if (y == 0) {
				co = "red";
			}
			if (y == 1) {
				co = "green";
			}
			if (y == 2) {
				co = "blue";
			}
			if (z == 0) {
				ro = "point";
			}
			if (z == 1) {
				ro = "flat";
			}
			house(h, co, ro);
		}
		Tortoise.explode();
		for (int i = 0; i > -1; i++) {
			int p = new Random().nextInt(4);
			if (p == 0) {
				Tortoise.getBackgroundWindow().setColor(Color.black);
			}
			if (p == 1) {
				Tortoise.getBackgroundWindow().setColor(Color.red);
			}
			if (p == 2) {
				Tortoise.getBackgroundWindow().setColor(Color.green);
			}
			if (p == 3) {
				Tortoise.getBackgroundWindow().setColor(Color.blue);
			}
		}
		
	}
	
	static void house(String Height, String c, String roof) {
		if (Height.equals("small")) {
			if (c.equals("red")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.red);
					Tortoise.move(60);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(60);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.CYAN);
					Tortoise.move(60);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(60);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
			if (c.equals("green")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.magenta);
					Tortoise.move(60);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(60);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.green);
					Tortoise.move(60);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(60);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
			if (c.equals("blue")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.blue);
					Tortoise.move(60);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(60);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.blue);
					Tortoise.move(60);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(60);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
		}
		if (Height.equals("medium")) {
			if (c.equals("red")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.ORANGE);
					Tortoise.move(120);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(120);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.red);
					Tortoise.move(120);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(120);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
			if (c.equals("green")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.green);
					Tortoise.move(120);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(120);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.green);
					Tortoise.move(120);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(120);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
			if (c.equals("blue")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.blue);
					Tortoise.move(120);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(120);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.blue);
					Tortoise.move(120);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(120);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
		}
		if (Height.equals("large")) {
			if (c.equals("red")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.red);
					Tortoise.move(250);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(250);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.red);
					Tortoise.move(250);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(250);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
			if (c.equals("green")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.green);
					Tortoise.move(250);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(250);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.green);
					Tortoise.move(250);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(250);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
			if (c.equals("blue")) {
				if (roof.equals("point")) {
					Tortoise.setPenColor(Color.blue);
					Tortoise.move(250);
					Tortoise.turn(45);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(45);
					Tortoise.move(250);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
				if (roof.equals("flat")) {
					Tortoise.setPenColor(Color.blue);
					Tortoise.move(250);
					Tortoise.turn(90);
					Tortoise.move(15);
					Tortoise.turn(90);
					Tortoise.move(250);
					Tortoise.turn(-90);
					Tortoise.setPenColor(Color.green);
					Tortoise.move(15);
					Tortoise.turn(-90);
				}
			}
		}
	}
}
