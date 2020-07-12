package game;

public class Item extends Stats {

	
	private static Integer id=1;
	private String name;
	private Integer value;
	
	
	public Item(String name, Integer value) {
		super();
		this.id=idGenerator();
		this.name=name;
		this.value=value;
	}
	
	
	public Item(Integer hitPoints, Integer strength, Integer agility, Integer intelligence, String name,
			Integer value) {
		super(hitPoints, strength, agility, intelligence);
		this.id=idGenerator();
		this.name = name;
		this.value = value;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	
	
	private int idGenerator() {
		
		return id++;
		
	}
	
	
	
	
	
	
}
