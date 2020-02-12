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

		boolean win = false;

		while (!win) {
			// prompt what letter they want to try
			System.out.println("Please choose which letter you want to try, or \"quit\" to quit.");

			String userchoice = scnr.next().toLowerCase();
			if (userchoice.equals("quit")) {
				win = true;
			} else {
				String checkThischar = userchoice.substring(0);
				int goodLetters = 0;
				for (int i = 0; i < hangmanWordArray.length; i++) {
					if (hangmanWordArray[i].equals(checkThischar)) {
						underscoreArray[i] = hangmanWordArray[i];
						goodLetters++;
						if (goodLetters >= hangmanWordArray.length) {
							win = true;
						}

					}
				}
				

			}
			for (int i = 0; i < underscoreArray.length; i++) {
				System.out.print(underscoreArray[i] + " ");
			}
			System.out.println();
//			if (lettersAreDone) {
//				win = true;
//			}

			// add playerscore to highscore
			// show highscore method

		}

	}
}
