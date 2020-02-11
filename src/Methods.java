import java.util.Scanner;

public class Methods {

	public static  String whichDifficulty() {

		Scanner scnr = new Scanner(System.in);
		String choice = scnr.next();

		if (choice.equals("easy")) {
			String easyWord = easyWord();
			return easyWord;

		} else if (choice.equals("medium")) {
			String mediumWord = mediumWord();
			return mediumWord;

		} else if (choice.equals("hard")) {
			String hardWord = hardWord();
			return hardWord;

		} else {
			return "jazz";
		}
	}

	public static String easyWord() {
		double x = Math.random() * 2;

		if (x <= 1) {
			return "git";
		} else {
			return "cat";
		}
	}

	public static String mediumWord() {
		double x = Math.random() * 2;

		if (x >= 1) {
			return "marker";
		} else {
			return "factory";
		}
	}

	public static String hardWord() {
		double x = Math.random() * 2;

		if (x >= 1) {
			return "interfaces";
		} else {
			return "singleton";
		}
	}

}
