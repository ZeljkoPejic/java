package game;

public class Player {

	
	
	private String name;
	private String gender;
	private Race race;
	
		
	
	public Player(String name, String gender, Race race) {
		
		this.name = name;
		this.gender = gender;
		this.race = race;
	}





	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected String getGender() {
		return gender;
	}


	protected void setGender(String gender) {
		this.gender = gender;
	}


	protected Race getRace() {
		return race;
	}


	protected void setRace(Race race) {
		this.race = race;
	}
	
	
	@Override
	public String toString() {
		
		return " Player name: "+ name + "\n Gender: "+ gender + race.toString();
	
	}
	
	
	
}
