import java.util.Random;
import java.util.Scanner;

public class Roshambo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Greet User, ask if they want to play
		
		System.out.println("Hello user, do you want to play Roshambo?\nType Y or N");
		
		String cont = scan.nextLine();
		
		int wrongCount = 0;
		
		while(wrongCount < 5) {
		
		if (!(cont.equalsIgnoreCase("Y") || cont.equalsIgnoreCase("N"))) {
		
			 System.out.println("Hey! No Cheating Dude!");
		 }
		wrongCount = scan.nextInt();
		 }	
		//Let user try certain number of times
		//Boot them out
		
		while (cont.equalsIgnoreCase("Y")) {
			
		//Launch the game
		// Loop the game based on user decision to continue, or not
		
		System.out.println("Do you want a Rock, Paper or Scissors?");
		System.out.println("Type R, for Rock, P, for paper, or S, for scissors");
		
		String usrInput = scan.nextLine();
		
		// System.out.println("You typed " + usrInput);
		
		// Randomly generate computer's "decision"
		
		
		Random generator = new Random();
		
		String compInput = null;
		
		int compChoice = generator.nextInt(3);
		
		switch (compChoice)
        {
            case 0:
                compInput = "R";
                break;
            case 1:
                compInput = "P";
                break;
            case 2:
                compInput = "S";
                break;
        
        }
		
		System.out.println(compInput);
		
		if (usrInput.equalsIgnoreCase(compInput)) {
			System.out.println("It's a Draw!");
		}else if ((usrInput.equalsIgnoreCase("R")) && (compInput.equalsIgnoreCase("P"))) {
			System.out.println("You Lose!");
		}else if ((usrInput.equalsIgnoreCase("P")) && (compInput.equalsIgnoreCase("S"))) {
			System.out.println("You Win!");
		}else if ((usrInput.equalsIgnoreCase("S")) && (compInput.equalsIgnoreCase("R"))) {
			System.out.println("Loser!");
		}else if ((usrInput.equalsIgnoreCase("R")) && (compInput.equalsIgnoreCase("S"))) {
			System.out.println("Winner!");
		}else if ((usrInput.equalsIgnoreCase("P")) && (compInput.equalsIgnoreCase("R"))) {
			System.out.println("Winner!");
		}else if ((usrInput.equalsIgnoreCase("S")) && (compInput.equalsIgnoreCase("P"))) {
			System.out.println("You Win!");
		}
		
		System.out.println("Do you want to play Roshambo again?");
		
		cont = scan.nextLine();
		
		}
		
		scan.close();
		
		System.out.println("Thanks, come back for more Roshambo!!!");
		
	}
	
}
