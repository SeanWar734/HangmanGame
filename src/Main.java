import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	private static FileHelper<Player> fileHelper = new FileHelper<>("src/Players.txt", new PlayerLineConverter());
	private static FileHelper<Word> easyWord = new FileHelper<>("src/Easy.txt", new WordLineConverter());
	private static FileHelper<Word> mediumWord = new FileHelper<>("src/Medium.txt", new WordLineConverter());
	private static FileHelper<Word> hardWord = new FileHelper<>("src/Hard.txt", new WordLineConverter());

	public static void main(String[] arg) {

		List<Player> player = fileHelper.readAll();
		List<Word> easy = easyWord.readAll();
		List<Word> medium = mediumWord.readAll();
		List<Word> hard = hardWord.readAll();

		// adding to the Player score text file
		fileHelper.rewrite(Arrays.asList(new Player("Jill", 462, 0)));
		fileHelper.append(new Player("Bill", 6, 2));
		fileHelper.append(new Player("Sean", 42, 999));

		// adding to the easy word list
		hardWord.rewrite(Arrays.asList(new Word("hub", "Git"), new Word("null", "empty or void")));
		hardWord.append(new Word("git", "Hub"));

		// adding to the medium word list
		mediumWord.rewrite(
				Arrays.asList(new Word("string", "words"), new Word("array", "container of objects that uses []")));
		mediumWord.append(new Word("append", "adding to something"));

		// adding to the hard word list
		easyWord.rewrite(Arrays.asList(new Word("primitive", "a data type"), new Word("protected", "access modifier")));
		easyWord.append(new Word("assertion", "uploading to git up"));

//FILE TEST
//		hardWord.rewrite(hard);
//		for (Word w : hard) {
//			hardWord.rewrite(hard);
//			System.out.println(w);
//		}
//		for (Word w : medium) {
//			hardWord.rewrite(medium);
//			System.out.println(w);
//		}
//		for (Word w : easy) {
//			System.out.println(w);
//		}
//		System.out.println(hardWord.toString()); 
//		System.out.println(mediumWord);
//		System.out.println(easyWord);
//END TEST

		Scanner scnr = new Scanner(System.in);

		try {
			TitleScreen.titleScreen();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Please enter your UserName: ");
		String name = Validator.getUserName(scnr, " is already is use, please choose a different one", player);

		Player newPlayer = new Player(name);

		String tempDifficulty = Validator.getString(scnr, "Hello " + name + " what difficulty would you like, easy, medium, or hard??");

		Word hangmanWord = new Word();

		if (tempDifficulty.equals("easy")) {
			hangmanWord = Methods.easyWord(easy);
		} else if (tempDifficulty.equals("medium")) {
			hangmanWord = Methods.mediumWord(medium);
		} else {
			hangmanWord = Methods.hardWord(hard);
		}

		String[] hangmanWordArray = hangmanWord.getWord().split("");
		String[] underscoreArray = new String[hangmanWord.getWord().length()];
		Stack<String> wrongLetter = new Stack<String>();

		for (int i = 0; i < hangmanWord.getWord().length(); i++) {
			underscoreArray[i] = "_";
		}

		// priming the loop
		boolean win = false;

		HangPerson.start();

		// print out the underscore array
		for (int i = 0; i < underscoreArray.length; i++) {
			System.out.print(underscoreArray[i] + " ");
		}
		System.out.println();

		int numLetters = underscoreArray.length;
		// Starting the main game loop
		while (!win) {

			String userchoice = Validator.getString(scnr,
					"Please choose which letter you want to try\n\"hint\" for a hint, or \"quit\" to quit. ");
			String checkThischar = userchoice.substring(0);

			// catch the quit out
			if (userchoice.equals("quit")) {
				win = true;
				break;
			}

			if (userchoice.equals("hint")) {
				System.out.println(hangmanWord.getHint());
				continue;
			}

			// checks to see if the letter guessed
			// is wrong and adds 1 to wrong
			Methods.checkIfLoss(userchoice, hangmanWordArray, newPlayer, wrongLetter);

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
			System.out.println("Wrong letters: " + wrongLetter.toString());

			if (newPlayer.getCorrect() >= numLetters) {
				win = true;
				newPlayer.setWins(1);
			}

		}

		fileHelper.append(newPlayer);
		player = fileHelper.readAll();
		try {
			PlayerScores.highScore(player);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		scnr.close();
	}

}
