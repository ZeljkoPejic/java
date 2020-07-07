package game;

public class Level {

	private Integer whatLevel;
	private Integer experience;

	public Level(Integer whatLevel, Integer experience) {

		this.whatLevel = whatLevel;
		this.experience = experience;
	}

	public Integer getWhatLevel() {
		return whatLevel;
	}

	public void setWhatLevel(Integer whatLevel) {
		this.whatLevel = whatLevel;
	}

	public Integer getExperience() {
		return experience;
	}

	public void setExperience(Integer experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {

		return String.valueOf(whatLevel);
	}

}
