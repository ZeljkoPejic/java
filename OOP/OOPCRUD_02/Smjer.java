package edunova.student;

public class Smjer {

	private Integer sifra;
	private String boja;
	private String mreznoMjesto;
	private String telefon;
	private Integer broj;
	private boolean prisutan;

	public Smjer(Integer sifra, String boja, String mreznoMjesto, String telefon, Integer broj, boolean prisutan) {
		this.sifra = sifra;
		this.boja = boja;
		this.mreznoMjesto = mreznoMjesto;
		this.telefon = telefon;
		this.broj = broj;
		this.prisutan = prisutan;
	}

	public Integer getSifra() {
		return sifra;
	}

	public void setSifra(Integer sifra) {
		this.sifra = sifra;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getMreznoMjesto() {
		return mreznoMjesto;
	}

	public void setMreznoMjesto(String mreznoMjesto) {
		this.mreznoMjesto = mreznoMjesto;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Integer getBroj() {
		return broj;
	}

	public void setBroj(Integer broj) {
		this.broj = broj;
	}

	public boolean isPrisutan() {
		return prisutan;
	}

	public void setPrisutan(boolean prisutan) {
		this.prisutan = prisutan;
	}

	@Override
	public String toString() {

		return sifra + " " + boja + " " + mreznoMjesto + " " + telefon + " " + broj + " " + prisutan;
	}
	
	public int zbrojStringa() {
		
		return boja.length()+mreznoMjesto.length()+telefon.length();
		
	}

}
