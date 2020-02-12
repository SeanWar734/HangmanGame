public class PlayerLineConverter implements LineConverter<Player> {

	@Override
	public String toLine(Player object) {
		return String.format("%s\t%d\t%d", object.getName(), object.getWins(), object.getLosses());
	}

	@Override
	public Player fromLine(String line) {
		String[] parts = line.split("\t");
		String name = parts[0];
		int wins = parts[1];
		int losses = parts[2];
		return new Player(name, wins, losses);
	}

}