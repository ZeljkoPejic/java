package game;

public class Race extends Stats{

	
	private String name;
	
	
	public Race() {
		super();
		name="Unknown";
		
	}



	public Race(String name) {
		super();
		this.name=name;
		
		switch(name) {
		
		case "human":
			setHitPoints(100);
			setStrength(12);
			setAgility(11);
			setIntelligence(13);
		break;
		case "elf":
			setHitPoints(100);
			setStrength(10);
			setAgility(12);
			setIntelligence(14);
			break;
		case "orc":
			setHitPoints(120);
			setStrength(15);
			setAgility(10);
			setIntelligence(9);
			break;
			
		
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "\n Race: " + name + super.toString();
	}
	
	
		
	
}
