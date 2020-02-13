import java.util.List;

public class Methods {

	public static Word easyWord(List<Word> a) {
		double x = Math.random() * 3;

		if (x <= 1) {
			return a.get(0);
		} else if (x > 1 && x <+ 2) {
			return a.get(1);
		} else {
			return a.get(2);
		}
	}

	public static Word mediumWord(List<Word> a) {
		double x = Math.random() * 3;

		if (x >= 1) {
			return a.get(0);
		} else if (x > 1 && x <+ 2){
			return a.get(1);
		} else {
			return a.get(2);
		}
	}

	public static Word hardWord(List<Word> a) {
		double x = Math.random() * 3;

		if (x >= 1) {
			return a.get(0);
		} else if (x > 1 && x <+ 2){
			return a.get(1);
		} else {
			return a.get(2);
		}
	}

	public static void checkIfLoss(String a, String[] b, Player player) {
		int x = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i].equals(a)) {
				x += 1;
			}
		}

		if (x == 0) {
			player.setWrong(1);
		}

	}

	public static String[] replaceLetter(String a, String[] b, String[] c) {
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

	public static void organizeList(List<Player> players, Player player) {
		// Comparator.comparing(player, player.getWins());
//		int wins = players.get(0).getWins();
//		for(int i = 1; i < players.size(); ++i) {
//			wins = players.get(i).getWins();
//			for(int j = 1; j < players.size(); ++j) {
//			if(wins <)	
//			}
//		}
	}

	public static void printHighScores(List<Player> list) {

		int j = 1;

		for (Player c : list) {
			System.out.printf(j + ") %-20s | %-20d | %-20d", c.getName(), c.getWins(), c.getLosses());
			System.out.println();
			j++;
		}
	}
}
