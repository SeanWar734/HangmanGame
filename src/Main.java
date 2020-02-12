import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner scnr = new Scanner(System.in);

		String name = Validator.getString(scnr, "Please input your name ");
		Player newPlayer = new Player(name);
		System.out.println("Hello " + name + " what difficulty would you like?");

		String hangmanWord = Methods.whichDifficulty();
		String[] hangmanWordArray = hangmanWord.split("");
		String[] underscoreArray = new String[hangmanWord.length()];

		for (int i = 0; i < hangmanWord.length(); i++) {
			underscoreArray[i] = "_";
		}

		System.out.println(hangmanWord);

		// priming the loop
		boolean win = false;
		
		// print out the underscore array
		for (int i = 0; i < underscoreArray.length; i++) {
			System.out.print(underscoreArray[i] + " ");
		}
		System.out.println();

		int numLetters = underscoreArray.length;

		// Starting the main game loop
		while (!win) {

			String userchoice = Validator.getString(scnr,
					"Please choose which letter you want to try, or \"quit\" to quit. ");
			String checkThischar = userchoice.substring(0);

			// catch the quit out
			if (userchoice.equals("quit")) {
				win = true;
				break;
			}

			// checks to see if the letter guessed
			// is wrong and adds 1 to wrong
			Methods.checkIfLoss(userchoice, hangmanWordArray, newPlayer);

			// checks to see if the letter guessed
			// is right and adds 1 to right
			for (int i = 0; i < hangmanWordArray.length; i++) {
				if (hangmanWordArray[i].equals(checkThischar)) {
					newPlayer.setCorrect(1);
				}
			}

			// replaces the underscore array at all instances
			// of the right letter and updates the underscore array
			underscoreArray = Methods.replaceLetter(checkThischar, hangmanWordArray, underscoreArray);

			// the print out screen
			switch (newPlayer.getWrong()) {
			case 0:
				HangPerson.start();
				break;
			case 1:
				HangPerson.oneWrong();
				break;
			case 2:
				HangPerson.twoWrong();
				break;
			case 3:
				HangPerson.threeWrong();
				break;
			case 4:
				HangPerson.fourWrong();
				break;
			case 5:
				HangPerson.fiveWrong();
				break;
			case 6:
				HangPerson.gameOver();
				newPlayer.setLosses(1);
				win = true;
				break;
			}

			Methods.printArray(underscoreArray);
			System.out.println("Number wrong: " + newPlayer.getWrong());
			System.out.println("Number right: " + newPlayer.getCorrect());

			if (newPlayer.getCorrect() >= numLetters) {
				win = true;
			}

		}

		System.out.println("We made it to the end");
		
		
		
		// add playerscore to highscore
		// show highscore method
		scnr.close();
	}
	
	
}
