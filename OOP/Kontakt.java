package edunova;

public class Kontakt {
	
	
	private String ime;
	private String telefon;
	private VrstaKontakta vrstaKontakta;
	private Integer duzan;
	
	
	public Kontakt() {
		
	}
	
	
	
	public Kontakt(String ime, String telefon, VrstaKontakta vrstaKontakta, Integer duzan) {
		super();
		this.ime = ime;
		this.telefon = telefon;
		this.vrstaKontakta = vrstaKontakta;
		this.duzan = duzan;
	}



	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public VrstaKontakta getVrstaKontakta() {
		return vrstaKontakta;
	}
	public void setVrstaKontakta(VrstaKontakta vrstaKontakta) {
		this.vrstaKontakta = vrstaKontakta;
	}

	public Integer getDuzan() {
		return duzan;
	}

	public void setDuzan(Integer duzan) {
		this.duzan = duzan;
	}
	
	
	

}
