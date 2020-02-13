import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import static java.nio.file.StandardCopyOption.*;

import java.io.IOException;

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

		
		int playCount = 0;
		Scanner scnr = new Scanner(System.in);

//		try {
//			TitleScreen.titleScreen();
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}

		

		System.out.println("Please enter your UserName: ");
		String name = Validator.getUserName(scnr, " is already is use, please choose a different one", player);

		Player newPlayer = new Player(name);
		boolean gameOver = false;
		String playAgain;
		System.out.print("Hello, " + newPlayer.getName() + ".");
		
		//APP START
		do {
			boolean win = false;
			System.out.println(" What difficulty would you like? [EASY, MEDIUM, HARD]");
			String tempDifficulty = Validator.getEasyMedHard(scnr, "Please enter a choice between [EASY.MEDIUM.HARD]: ");
	
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
			System.out.printf("\n\n%80s\n\n","GAME START");
			scnr.nextLine();
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
			if(playCount > 0) {
				try {
					Files.copy(Paths.get("src/Players.txt"),Paths.get("src/Players.txt"),REPLACE_EXISTING);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
			player.add(newPlayer);
			fileHelper.rewrite(player);
			}
			//player = fileHelper.readAll();
			try {
				PlayerScores.highScore(player);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			newPlayer.setCorrect(0);
			newPlayer.setWrong(0);
			
			playAgain = Validator.getYesNo(scnr,"\n\n\nWould you like to play again?(Y/N)\n\n\n");
			++playCount;
		}while(playAgain.equalsIgnoreCase("YES"));
		System.out.printf("\n\n%80s\n","THANKS FOR PLAYING");
		scnr.close();
	}

}
