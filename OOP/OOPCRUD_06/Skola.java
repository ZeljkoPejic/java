package edunova.skola;

import java.math.BigDecimal;

public class Skola {

	private static int id =1;
	
	private Integer sifra;
	private BigDecimal cijena;
	private String boja;
	private Integer komada;
	private BigDecimal promjer;
	private String vrsta;
	private Otpremnica otpremnica;
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra() {
		this.sifra = randId();
	}
	public BigDecimal getCijena() {
		return cijena;
	}
	public void setCijena(BigDecimal cijena) {
		this.cijena = cijena;
	}
	public String getBoja() {
		return boja;
	}
	public void setBoja(String boja) {
		this.boja = boja;
	}
	public Integer getKomada() {
		return komada;
	}
	public void setKomada(Integer komada) {
		this.komada = komada;
	}
	public BigDecimal getPromjer() {
		return promjer;
	}
	public void setPromjer(BigDecimal promjer) {
		this.promjer = promjer;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	public Otpremnica getOtpremnica() {
		return otpremnica;
	}
	public void setOtpremnica(Otpremnica otpremnica) {
		this.otpremnica = otpremnica;
	}
	
	
	private int randId() {
		
		return id++;
		
	}
	
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(sifra+" ");
		sb.append(cijena+" ");
		sb.append(boja+" ");
		sb.append(komada+" ");
		sb.append(promjer+" ");
		sb.append(vrsta+" ");
		sb.append(otpremnica);
		
		return sb.toString();
		
	}
	
	
}
