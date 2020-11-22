package snakeLadder;

import java.util.Random;

public class SnakeLadder {
	
	int Position = 0;
	static int dieValue;
	
	public int rollDie() {
		Random r = new Random();
		int Die = r.nextInt(6) + 1;
		return Die;
	}	
	public int playOption() {
		int newPosition = 0;
		dieValue = rollDie();
		System.out.println("Die Value" +dieValue);						
		Random r = new Random();
		int option = r.nextInt(3);
		
		if(option == 0) {			
			System.out.println("No Play");
			newPosition = Position;
		}
		else if (option == 1) {
			
			System.out.println("You are currently on Ladder ");
				newPosition = ladder();			
			}
		else if (option == 2) {
			System.out.println("You are currently on Snake ");
			newPosition = snake();
		}
		return newPosition;

	}
			
	public static void main(String []args) {
		
		System.out.println("Welcome to Snake & Ladder Game");
		
		SnakeLadder snakeLadder = new SnakeLadder();		
		snakeLadder.rollDie();
		snakeLadder.playOption();
	}
}
