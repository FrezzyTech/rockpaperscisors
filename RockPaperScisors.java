package rockpaperscisors;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScisors {

	public static void main(String[] args) {
		
		int points = 0;
		boolean gameState = true;
		Scanner scan = new Scanner(System.in);
		while(gameState) {
			System.out.println("Pick your choice: ");
			String choice = scan.nextLine();
			String finalResult = choice + " " + computerChoice(); 
		
		switch(finalResult) {
		case "rock scissors":
		case  "paper rock":
		case "scissors paper":
			gameWin(choice);
			points++;
			break;
		case "scissors rock":
		case "rock paper":
		case "paper scissors":
			gameLose(choice);
			points--;
			break;
		case "rock rock":
		case "paper paper":
		case "scissors scissors":
			gameDraw(choice);
			break;
		default:
			System.out.println("Input a valid option: ");
			break;
		}
		
		System.out.println("Score: " + points + "\n");
		System.out.println("Do you want to continue playing? (y/n)");
		String gameChoice = scan.nextLine().toLowerCase();
		if(gameChoice == "n") 
		gameState = false;
		
		
		
		}
	}
	
	public static void gameWin(String choice) {
		System.out.println("You chose: " + choice);
		System.out.println("Computer chose " + computerChoice());
		System.out.println(choice + " beats " + computerChoice());
		System.out.println("You won!");
		
		
	}
	public static void gameLose(String choice) {
	System.out.println("You chose: " + choice);
	System.out.println("Computer chose " + computerChoice());
	System.out.println(computerChoice() + " beats " + choice);
	System.out.println("You lost!");
	}
	public static void gameDraw(String choice) {
	System.out.println("You chose: " + choice);
	System.out.println("Computer chose " + computerChoice());
	System.out.println(choice + " is equal to " + computerChoice());
	System.out.println("It's draw!");
	}
	
	public static String computerChoice() {
		String[] choices = {"rock", "paper", "scissors"};
		Random rand = new Random();
		int randomIndex = rand.nextInt(choices.length);
		String randomChoice = choices[randomIndex];
		return randomChoice;
	}
	
	}

