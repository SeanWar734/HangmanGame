/**
 * 
 * @author JillianCenters
 *
 */
public class Player {

	private String name;
	private int wins;
	private int losses;
	private int pin;
	private String[] data;
//CONSTRUCTORS
	public Player() {
		
	}
	public Player(String name) {
		this.name = name;
		wins = 0;
		losses = 0;
		pin = 0; 
		data = null;
	}
//GETTERS SETTERS
	public String getName() {
		return name;
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
		this.losses = losses;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
//DATA IS FOR LEADERBOARD PRINTING
	public String[] getData() {
		return data;
	}
	 public void setData(Player player) {
		String info = player.toString();
		String[] data = info.split(" ");
		this.data = data;
	}
	
	
	
	//TOSTRING
	@Override
	public String toString() {
		return String.format("%d %d %s", wins,losses,name); 
	}
	
	
	
}
