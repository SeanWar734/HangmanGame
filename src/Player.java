
public class Player {

	private String name;
	private int wins;
	private int losses;
	private int correct;
	private int wrong;
//CONSTRUCTORS
	public Player() {
		
	}
	public Player(String name) {
		this.name = name;
		wins = 0;
		losses = 0;
		correct = 0;
		wrong = 0;
	}
	public Player(String name2, int wins2, int losses2) {
		this.name = name2;
		this.wins = wins2;
		this.losses = losses2;
	}
	//GETTERS SETTERS
	public String getName() {
		return name;
	}
	public int getCorrect() {
		return correct;
	}
	public void setCorrect(int correct) {
		this.correct += correct;
	}
	public int getWrong() {
		return wrong;
	}
	public void setWrong(int wrong) {
		this.wrong += wrong;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getLosses() {
		return losses;
	}
	public void setLosses(int losses) {
		this.losses += losses;
	}
	public static int grabWins(Player player) {
		return player.getWins();
	}

//DATA IS FOR LEADERBOARD PRINTING
//	public String[] getData() {
//		return data;
//	}
//	 public void setData(Player player) {
//		String info = player.toString();
//		String[] data = info.split(" ");
//		this.data = data;
//	}
	
	
	
	//TOSTRING
	@Override
	public String toString() {
		return String.format("%d %d %s", wins,losses,name); 
	}
	
	
	
}
