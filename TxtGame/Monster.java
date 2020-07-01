package game;

public class Monster extends Stats{

	
	private String name;

	public Monster(Integer hitPoints, Integer strength, Integer agility, Integer intelligence, String name) {
		super(hitPoints, strength, agility, intelligence);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
