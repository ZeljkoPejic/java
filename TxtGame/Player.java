package game;

public class Player {

	private String name;
	private Race race;
	private Integer gold;
		
	public Player(String name, Race race) {
		
		this.name = name;
		this.race = race;
		this.gold = 10;
	}

	public String getName() {
		return name;
	}

	public Race getRace() {
		return race;
	}
	
	public Integer getGold() {
		return gold;
	}
	
	@Override
	public String toString() {
		
		return " Player name: "+ name + race.toString();
	
	}
		
}
