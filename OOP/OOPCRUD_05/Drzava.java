package edunova.smjer;

import java.math.BigDecimal;

public class Drzava {

	private static int id = 1;
	
	private Integer sifra;
	private Boolean omogucen;
	private String mreznoMjesto;
	private String ime;
	private BigDecimal volumen;
	private String boja;
	
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra() {
		this.sifra = idGenerator();
	}
	public Boolean getOmogucen() {
		return omogucen;
	}
	public void setOmogucen(Boolean omogucen) {
		this.omogucen = omogucen;
	}
	public String getMreznoMjesto() {
		return mreznoMjesto;
	}
	public void setMreznoMjesto(String mreznoMjesto) {
		this.mreznoMjesto = mreznoMjesto;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public BigDecimal getVolumen() {
		return volumen;
	}
	public void setVolumen(BigDecimal volumen) {
		this.volumen = volumen;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	
	private int idGenerator() {

		return id++;

	}
	
	
	public int zbrojZnakova() {
		
		return mreznoMjesto.length()+ime.length()+boja.length();
		
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(sifra+" ");
		sb.append(omogucen+" ");
		sb.append(mreznoMjesto+" ");
		sb.append(ime+" ");
		sb.append(volumen+" ");
		sb.append(boja);
		
		return sb.toString();
		
	}
	
	
}
