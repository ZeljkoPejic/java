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

	public void setHitPoints(Integer hitPoints) {
		this.hitPoints = hitPoints;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public void setAgility(Integer agility) {
		this.agility = agility;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getHitPoints() {
		return hitPoints;
	}

	public Integer getStrength() {
		return strength;
	}

	public Integer getAgility() {
		return agility;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void addHitPoints() {
		hitPoints += 10;
	}

	public void addStrength() {
		strength++;
	}

	public void addAgility() {
		agility++;
	}

	public void addIntelligence() {
		intelligence++;
	}

	@Override
	public String toString() {

		return "\n Hitpoints: " + hitPoints + "\n Strength: " + strength + "\n Agility: " + agility
				+ "\n Intelligence: " + intelligence;

	}

}
