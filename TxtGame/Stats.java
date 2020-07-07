package game;

public abstract class Stats {

	private Integer hitPoints;
	private Integer strength;
	private Integer agility;
	private Integer intelligence;
	
	
	public Stats() {
		
	}
	
	
	
	public Stats(Integer hitPoints, Integer strength, Integer agility, Integer intelligence) {
		this.hitPoints = hitPoints;
		this.strength = strength;
		this.agility = agility;
		this.intelligence = intelligence;
	}
	public Integer getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}
	public Integer getStrength() {
		return strength;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public Integer getAgility() {
		return agility;
	}
	public void setAgility(Integer agility) {
		this.agility = agility;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	
	
	@Override
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		sb.append("HP: "+hitPoints);
		sb.append("\nstr: "+strength);
		sb.append("\nagi: "+agility);
		sb.append("\n int: "+intelligence);
		
		return sb.toString();
		
		
	}
	
}
