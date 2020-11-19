package snakeLadder;

import java.util.Random;


public class SnakeLadder {
	
	int Position = 0;
	
	public int rollDice() {
		Random r = new Random();
		int Die = r.nextInt(6) + 1;
		return Die;
	}	
	
	public static void main(String []args) {
		
		System.out.println("Welcome to Snake & Ladder Game");
		
		SnakeLadder snakeLadder = new SnakeLadder();		
		snakeLadder.rollDice();
	}
	

}
