import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner scnr = new Scanner(System.in);

		String name = Validator.getString(scnr, "Please input your name ");
		System.out.println("Hello " + name + " what difficulty would you like?");

		String hangmanWord = Methods.whichDifficulty();
		String[] hangmanWordArray = hangmanWord.split("");
		String[] underscoreArray = new String[hangmanWord.length()];

		for (int i = 0; i < hangmanWord.length(); i++) {
			underscoreArray[i] = "_";
		}

		System.out.println(hangmanWord);

		// initialize their first choice

		boolean win = false;
		int goodLetters = 0;

		// print out the underscore array
		for (int i = 0; i < underscoreArray.length; i++) {
			System.out.print(underscoreArray[i] + " ");
		}
		System.out.println();

		// Starting the main game loop

		int correct = 0;
		int wrong = 0;

		while (!win) {

			String userchoice = Validator.getString(scnr,
					"Please choose which letter you want to try, or \"quit\" to quit. ");
			String checkThischar = userchoice.substring(0);

			// catch the quit out
			if (userchoice.equals("quit")) {
				win = true;
				break;
			}

			for (int i = 0; i < hangmanWordArray.length; i++) {
				if (hangmanWordArray[i].equals(checkThischar)) {
					correct += 1;
				}
			}

			underscoreArray = Methods.checkLetter(checkThischar, hangmanWordArray, underscoreArray);
			Methods.printArray(underscoreArray);
			System.out.println("Number wrong: " + wrong);
			System.out.println("Number right: " + correct);

		}

		// add playerscore to highscore
		// show highscore method

	}
}
