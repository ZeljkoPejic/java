package edunova;

public class VrstaKontakta {

	
	private Integer sifra;
	private String naziv;
	
	
	public VrstaKontakta() {
		
	}
	
		
	public VrstaKontakta(Integer sifra, String naziv) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
	}



	public Integer getSifra() {
		return sifra;
	}
	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	
	
	
}
