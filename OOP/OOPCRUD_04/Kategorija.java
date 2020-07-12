package edunova.kategorija;

import java.time.LocalDate;

public class Kategorija {

	//svojstva:šifra (cijeli broj), posuden (datum), prisutan (logička vrijednost), visina (cijeli broj), email (znakovni tip), broj (cijeli broj) te škola
	
	private static int id=1;
	
	private Integer sifra;
	private LocalDate posuden;
	private Boolean prisutan;
	private Integer visina;
	private String email;
	private Integer broj;
	private Skola skola;
	
	
	
	public Integer getSifra() {
		return sifra;
	}
	public void setSifra() {
		this.sifra = idGenerator();
	}
	public LocalDate getPosuden() {
		return posuden;
	}
	public void setPosuden(LocalDate posuden) {
		this.posuden = posuden;
	}
	public Boolean getPrisutan() {
		return prisutan;
	}
	public void setPrisutan(Boolean prisutan) {
		this.prisutan = prisutan;
	}
	public Integer getVisina() {
		return visina;
	}
	public void setVisina(Integer visina) {
		this.visina = visina;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getBroj() {
		return broj;
	}
	public void setBroj(Integer broj) {
		this.broj = broj;
	}
	public Skola getSkola() {
		return skola;
	}
	public void setSkola(Skola skola) {
		this.skola = skola;
	}
	
	private int idGenerator() {

		return id++;

	}
	
	
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(sifra+" ");
		sb.append(posuden+" ");
		sb.append(prisutan+" ");
		sb.append(visina+" ");
		sb.append(email+" ");
		sb.append(broj+" ");
		sb.append(skola);
		
		return sb.toString();
		
	}
	
	
}
