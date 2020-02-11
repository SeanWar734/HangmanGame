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
	
//CONSTRUCTORS
	public Player() {
		
	}
	public Player(String name) {
		this.name = name;
		wins = 0;
		losses = 0;
		pin = 0;
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
	
	
	
	
}
