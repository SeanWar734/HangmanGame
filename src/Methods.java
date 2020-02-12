import java.util.Map;
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
	
	public static String[] checkLetter(String a, String[] b, String[] c) {
		for (int i = 0; i < b.length; i++) {
			if (b[i].equals(a)) {
				c[i] = b[i];
			}
		}
		return c;
	}
	
	public static void printArray(String[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	
	
	public static void setPlayerMap(Map<Integer,Player> players, Player player) {
		
		players.put(players.put(player);
	}
	
	
	
}
