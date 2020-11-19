package snakeLadder;

import java.util.Random;

public class SnakeLadder {
	
	int Position = 0;
	
	public static void main(String []args) {
				
		System.out.println("Welcome to Snake & Ladder Game");
	}
	
	public int rollDice() {
		Random r = new Random();
		int Die = r.nextInt(6) + 1;
		return Die;
	}	

}
