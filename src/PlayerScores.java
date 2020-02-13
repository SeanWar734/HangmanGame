import java.util.List;

public class PlayerScores {

	public static void highScore(List<Player> a) throws InterruptedException {
		
		int j = 1;
		
		for (int i = 0; i < 40; ++i) {
			System.out.println(
					"                                                                                                    ");

		}
		String importantInfo[] = {
				"                         * * * * * * * * * * * * * THE BEST PLAYERS! * * * * * * * * * * * * *",
				"                           RANK           NAME                                     WIN/LOSS",
				"                           ------------   --------------------------------------   --------", " ", " ",
				" "};
		
		String spaces[] = {" ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ",};

		for (int i = 0; i < importantInfo.length; i++) {
			// Pause for 4 seconds
			Thread.sleep(300);
			// Print a message
			System.out.println(importantInfo[i]);
		}
		
		for (int i = 0; i < a.size(); i++) {
			// Pause for 4 seconds
			Thread.sleep(300);
			// Print a message
			System.out.printf("%30d %15s %40d/%d", j, a.get(i).getName(), a.get(i).getWins(), a.get(i).getLosses());
			System.out.println();
			System.out.println();
			System.out.println();
			j++;
		}
		
		for (int i = 0; i < spaces.length; i++) {
			// Pause for 4 seconds
			Thread.sleep(300);
			// Print a message
			System.out.println(spaces[i]);
		}
		

	}

	public static void clearScreen() {
		for (int i = 0; i < 50; ++i)
			System.out.println();
	}

}
