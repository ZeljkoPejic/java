package edunova.zgrada;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Zgrada {

	private static Integer id = 1;
	
	private String sifra;
	private BigDecimal opseg;
	private String opis;
	private Boolean dopusten;
	private Boolean prisutan;
	private LocalDate datum;
	private Stranica stranica;
	
	
	public String getSifra() {
		return sifra;
	}
	public void setSifra() {
		this.sifra = idGenerator();
	}
	public BigDecimal getOpseg() {
		return opseg;
	}
	public void setOpseg(BigDecimal opseg) {
		this.opseg = opseg;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String opis) {
		this.opis = opis;
	}
	public Boolean getDopusten() {
		return dopusten;
	}
	public void setDopusten(Boolean dopusten) {
		this.dopusten = dopusten;
	}
	public Boolean getPrisutan() {
		return prisutan;
	}
	public void setPrisutan(Boolean prisutan) {
		this.prisutan = prisutan;
	}
	public LocalDate getDatum() {
		return datum;
	}
	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}
	public Stranica getStranica() {
		return stranica;
	}
	public void setStranica(Stranica stranica) {
		this.stranica = stranica;
	}
	
	private String idGenerator() {

		return String.valueOf(id++);

	}
	
	
	@Override
	public String toString() {
	
		StringBuilder sb = new StringBuilder();
		sb.append(sifra+" ");
		sb.append(opseg+" ");
		sb.append(opis+" ");
		sb.append(dopusten+" ");
		sb.append(prisutan+" ");
		sb.append(datum+" ");
		sb.append(stranica);
		
		
		return sb.toString();
	}

	
}
