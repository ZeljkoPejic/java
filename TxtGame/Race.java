package game;

public class Race extends Stats{

	
	private String name;
	
	
	public Race(String name) {
		
		this.name=name;
		
		switch(name) {
		// 1 - Human
		case "Human":		
			setHitPoints(100);
			setStrength(12);
			setAgility(11);
			setIntelligence(13);
		break;
		// 2 - Elf
		case "Elf":		
			setHitPoints(100);
			setStrength(10);
			setAgility(12);
			setIntelligence(14);
			break;
		// 3 - Orc
		case "Orc":
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

		
	@Override
	public String toString() {
		return "\n Race: " + name + super.toString();
	}
	
	
		
	
}
