import java.util.Scanner;

public class Main {

	public static void main(String[] arg) {

		Scanner scnr = new Scanner(System.in);

		String name = Validator.getString(scnr, "Please input your name ");
		int goodLetters = 0;

		
		System.out.println("Hello " + name + " what difficulty would you like?");
		String hangmanWord = Methods.whichDifficulty();
		String[] hangmanWordArray = hangmanWord.split("");

		String[] underscoreArray = new String[hangmanWord.length()];

		for (int i = 0; i < hangmanWord.length(); i++) {
			underscoreArray[i] = "_";
		}

		System.out.println(hangmanWord);

		boolean win = false;
		
		System.out.println("Please choose which letter you want to try, or \"quit\" to quit.");
		String userchoice = scnr.next().toLowerCase();
		
		while (!win) {
			// prompt what letter they want to try
			
			
			if (userchoice.equals("quit")) {
				win = true;
				break;
			} else {
				String checkThischar = userchoice.substring(0);
				
				if (goodLetters >= hangmanWordArray.length) {
					win = true;
				}
				
				for (int i = 0; i < hangmanWordArray.length; i++) {
					if (hangmanWordArray[i].equals(checkThischar)) {
						underscoreArray[i] = hangmanWordArray[i];
						goodLetters++;
						
					}
				}
			}

			for (int i = 0; i < underscoreArray.length; i++) {
				System.out.print(underscoreArray[i] + " ");
			}
			System.out.println();

		}

		// add playerscore to highscore
		// show highscore method

	}
}
