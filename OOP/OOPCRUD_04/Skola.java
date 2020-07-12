package edunova.kategorija;

import java.time.LocalDate;

public class Skola {

	
	
	//šifra (znakovni tip), prodan (datum), kvaliteta (znakovni tip), twitter (znakovni tip), vrsta (znakovni tip) i kupljen (datum)
	
	private static int id=1;
	
	private String sifra;
	private LocalDate prodan;
	private String kvaliteta;
	private String twitter;
	private String vrsta;
	private LocalDate kupljen;
	
	
	
	public String getSifra() {
		return sifra;
	}
	public void setSifra() {
		this.sifra = idGenerator();
	}
	public LocalDate getProdan() {
		return prodan;
	}
	public void setProdan(LocalDate prodan) {
		this.prodan = prodan;
	}
	public String getKvaliteta() {
		return kvaliteta;
	}
	public void setKvaliteta(String kvaliteta) {
		this.kvaliteta = kvaliteta;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public LocalDate getKupljen() {
		return kupljen;
	}
	public void setKupljen(LocalDate kupljen) {
		this.kupljen = kupljen;
	}
	
	private String idGenerator() {

		return String.valueOf(id++);

	}

	public int zbrojZnakova() {
		
		return sifra.length()+kvaliteta.length()+twitter.length()+vrsta.length();
		
	}
	
	
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(sifra+" ");
		sb.append(prodan+" ");
		sb.append(kvaliteta+" ");
		sb.append(twitter+" ");
		sb.append(vrsta+" ");
		sb.append(kupljen);
		
		return sb.toString();
		
	}
	
	
	
}
