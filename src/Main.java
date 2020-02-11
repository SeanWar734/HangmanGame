import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		String name = Validator.getString(scnr, "Please input your name ");

		System.out.println("Hello " + name + " what difficulty would you like?");
		String hangmanWord = Methods.whichDifficulty();
		System.out.println(hangmanWord);
		
	
	
	

		boolean win = false;

		while (!win) {
			// prompt what letter they want to try
			System.out.println("Please choose which letter you want to try, or \"quit\" to quit.");

			String userchoice = scnr.next().toLowerCase();
			if (userchoice.equals("quit")) {
				System.exit(0);
			} else {
				char checkThisNum = userchoice.charAt(0);

				// check to see if letter is in hangmanWord
				// print board

				// if all letters are checked, set lettersAreDone to true
			}

//			if (lettersAreDone) {
//				win = true;
//			}

			// add playerscore to highscore
			System.out.println("Good Game!");
			// show highscore method

		}

	}
}
