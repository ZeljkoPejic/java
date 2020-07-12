package edunova.smjer;

import java.time.LocalDate;

public class Smjer {
	
	private static int id=1;
	
	private Integer sifra;
	private String adresa;
	private Boolean dopusten;
	private String naziv;
	private Boolean zabranjen;
	private LocalDate prodan;
	private Drzava drzava;
	
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra() {
		this.sifra = idGenerator();
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public Boolean getDopusten() {
		return dopusten;
	}
	public void setDopusten(Boolean dopusten) {
		this.dopusten = dopusten;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Boolean getZabranjen() {
		return zabranjen;
	}
	public void setZabranjen(Boolean zabranjen) {
		this.zabranjen = zabranjen;
	}
	public LocalDate getProdan() {
		return prodan;
	}
	public void setProdan(LocalDate prodan) {
		this.prodan = prodan;
	}
	public Drzava getDrzava() {
		return drzava;
	}
	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}
	
	
	private int idGenerator() {

		return id++;

	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(sifra+" ");
		sb.append(adresa+" ");
		sb.append(dopusten+" ");
		sb.append(naziv+" ");
		sb.append(zabranjen+" ");
		sb.append(prodan+" ");
		sb.append(drzava);
		
		return sb.toString();
		
	}
	

}
