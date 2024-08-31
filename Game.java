import java.util.Random;
import java.util.Scanner;


//Guess the correct number in a single try. The number is generated randomly.
public class Game {
	
	int noOfGuesses= 0;
	int randInt =0;
	
	Game() {
		Random rand = new Random();
		randInt= rand.nextInt(2);
	}
	
	public int takeUserInput() {
		Scanner inp= new Scanner(System.in);
		int n= inp.nextInt();
		return n;
	}
	
	public boolean isCorrectNumber(int input) {
		int n= input;
		if(n==randInt) {
			System.out.println("You guessed correct number");
			return true;
		}
		else {
		System.out.println("You guessed wrong number");
		return false;
		}
	}
	
public static void main(String[] args) {
	Game num = new Game();
	int input= num.takeUserInput();
	num.isCorrectNumber(input);
}
}