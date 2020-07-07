package game;

public class Race {

	
	private String name;
	
	public Race(String name) {
	
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
	
		return name;
	}
	
	
	
}
