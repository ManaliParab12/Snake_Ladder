package snakeLadder;

import java.util.Random;

public class SnakeLadder {
	
	int Position = 0;
	
	public int rollDice() {
		Random r = new Random();
		int Die = r.nextInt(6) + 1;
		return Die;
	}	
	
public void playOption() {
		
		Random r = new Random();
		int option = r.nextInt(3);
		
		if(option == 0) {
			
			System.out.println("No Play");		
		}
		else if (option == 1) {
			
			Position = Position + rollDice();	
					
			System.out.println("You are currently on Ladder " + Position);			
		}
		else {
			Position = Position - rollDice();
			System.out.println("You are currently on Snake " + Position);			
			}
		}
		
	public static void main(String []args) {
		
		System.out.println("Welcome to Snake & Ladder Game");
		
		SnakeLadder snakeLadder = new SnakeLadder();		
		snakeLadder.rollDice();
		snakeLadder.playOption();
	}
}
