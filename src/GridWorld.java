import info.gridworld.world.*;
import info.gridworld.actor.*;
import info.gridworld.grid.*;
import info.gridworld.gui.*;
import java.awt.Color;
import java.util.Random;

import info.gridworld.*;

public class GridWorld {
	
	public static void main(String[] args) {
		World one = new World();
		one.show();

		for (int i = 0; i < 10; i++) {
			Flower rose = new Flower();
			Location x3 = new Location (i, 0);
			int x1 = new Random().nextInt(3);
			if (x1 == 1) {
				rose.setColor(Color.black);
			}
			else if (x1 == 2) {
				rose.setColor(Color.cyan);
			}
			else {
				rose.setColor(Color.MAGENTA);
			}
			one.add(x3, rose);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose1 = new Flower();
			Location x4 = new Location (i, 1);
			int x2 = new Random().nextInt(3);
			if (x2 == 1) {
				rose1.setColor(Color.black);
			}
			else if (x2 == 2) {
				rose1.setColor(Color.MAGENTA);
			}
			else {
				rose1.setColor(Color.orange);
			}
			one.add(x4, rose1);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose2 = new Flower();
			Location x5 = new Location (i, 2);
			int x3 = new Random().nextInt(3);
			if (x3 == 1) {
				rose2.setColor(Color.black);
			}
			else if (x3 == 2) {
				rose2.setColor(Color.cyan);
			}
			else {
				rose2.setColor(Color.orange);
			}
			one.add(x5, rose2);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose3 = new Flower();
			Location x6 = new Location (i, 3);
			int x4 = new Random().nextInt(3);
			if (x4 == 1) {
				rose3.setColor(Color.black);
			}
			else if (x4 == 2) {
				rose3.setColor(Color.cyan);
			}
			else {
				rose3.setColor(Color.orange);
			}
			one.add(x6, rose3);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose4 = new Flower();
			Location x7 = new Location (i, 4);
			int x5 = new Random().nextInt(3);
			if (x5 == 1) {
				rose4.setColor(Color.darkGray);
			}
			else if (x5 == 2) {
				rose4.setColor(Color.cyan);
			}
			else {
				rose4.setColor(Color.MAGENTA);
			}
			one.add(x7, rose4);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose5 = new Flower();
			Location x8 = new Location (i, 5);
			int x6 = new Random().nextInt(3);
			if (x6 == 1) {
				rose5.setColor(Color.black);
			}
			else if (x6 == 2) {
				rose5.setColor(Color.darkGray);
			}
			else {
				rose5.setColor(Color.orange);
			}
			one.add(x8, rose5);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose6 = new Flower();
			Location x9 = new Location (i, 6);
			int x7 = new Random().nextInt(3);
			if (x7 == 1) {
				rose6.setColor(Color.black);
			}
			else if (x7 == 2) {
				rose6.setColor(Color.cyan);
			}
			else {
				rose6.setColor(Color.orange);
			}
			one.add(x9, rose6);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose7 = new Flower();
			Location x10 = new Location (i, 7);
			int x8 = new Random().nextInt(3);
			if (x8 == 1) {
				rose7.setColor(Color.PINK);
			}
			else if (x8 == 2) {
				rose7.setColor(Color.cyan);
			}
			else {
				rose7.setColor(Color.darkGray);
			}
			one.add(x10, rose7);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose8 = new Flower();
			Location x11 = new Location (i, 8);
			int x9 = new Random().nextInt(3);
			if (x9 == 1) {
				rose8.setColor(Color.black);
			}
			else if (x9 == 2) {
				rose8.setColor(Color.PINK);
			}
			else {
				rose8.setColor(Color.orange);
			}
			one.add(x11, rose8);
		}
		for (int i = 0; i < 10; i++) {
			Flower rose9 = new Flower();
			Location x12 = new Location (i, 9);
			int x10 = new Random().nextInt(3);
			if (x10 == 1) {
				rose9.setColor(Color.black);
			}
			else if (x10 == 2) {
				rose9.setColor(Color.cyan);
			}
			else {
				rose9.setColor(Color.orange);
			}
			one.add(x12, rose9);
		}
		
		Bug fly = new Bug();
		Location x1 = new Location(2, 2);
		one.add(x1, fly);
		Location x2 = new Location (7, 6);
		Bug fly2 = new Bug();
		int x = new Random().nextInt(3);
		if (x == 1) {
			fly2.setColor(Color.black);
		}
		else if (x == 2) {
			fly2.setColor(Color.cyan);
		}
		else {
			fly2.setColor(Color.PINK);
		}
		fly2.turn();
		one.add(x2, fly2);
	}

	
}


