package game;

public class Player {

	
	
	private String name;
	private Race race;
	
		
	
	public Player(String name, Race race) {
		
		this.name = name;
		this.race = race;
	}





	public String getName() {
		return name;
	}

	public Race getRace() {
		return race;
	}

	
	@Override
	public String toString() {
		
		return " Player name: "+ name + race.toString();
	
	}
	
	
	
}
