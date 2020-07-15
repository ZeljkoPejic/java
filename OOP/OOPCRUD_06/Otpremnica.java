package edunova.skola;

import java.time.LocalDate;

public class Otpremnica {

	private static int id=1;
	
	private Integer sifra;
	private Boolean aktivan;
	private Boolean omogucen;
	private String twitter;
	private String telefon;
	private LocalDate napravljen;
	
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra() {
		this.sifra = randId();
	}
	public Boolean getAktivan() {
		return aktivan;
	}
	public void setAktivan(Boolean aktivan) {
		this.aktivan = aktivan;
	}
	public Boolean getOmogucen() {
		return omogucen;
	}
	public void setOmogucen(Boolean omogucen) {
		this.omogucen = omogucen;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public LocalDate getNapravljen() {
		return napravljen;
	}
	public void setNapravljen(LocalDate napravljen) {
		this.napravljen = napravljen;
	}
	
	private int randId() {
		
		return id++;
		
	}
	
	
	public int zbrojZnakova() {
		
		return twitter.length()+telefon.length();
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(sifra+" ");
		sb.append(aktivan+" ");
		sb.append(omogucen+" ");
		sb.append(twitter+" ");
		sb.append(telefon+" ");
		sb.append(napravljen);
		
		
		return sb.toString();
		
	}
	
	
}
