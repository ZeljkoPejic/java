package game;



public class Player extends Stats {

	


	private String name;
	private Integer gold;
	private Level level;
	private Race race;
	
	
	
	
	public Player() {
		super();
	}
	
	
	public Player(Integer hitPoints, Integer strength, Integer agility, Integer intelligence, String name, Integer gold,
			Level level, Race race) {
		super(hitPoints, strength, agility, intelligence);
		this.name = name;
		this.gold = gold;
		this.level = level;
		this.race = race;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
	public Integer getGold() {
		return gold;
	}
	public void setGold(Integer gold) {
		this.gold = gold;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	
	
	
	
	
	@Override
	public String toString() {
	
	StringBuilder sb = new StringBuilder();
	sb.append("Name: "+name);
	sb.append("  lvl: "+level.toString());
	sb.append("\nRace: "+race.toString());
	sb.append("\ngold: "+gold);
	sb.append("\n");
		
		return sb.toString()+super.toString();
	}
	
	
}
