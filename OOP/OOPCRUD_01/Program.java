package edunova.soba;


import java.util.Date;

public class Program {

	private static Integer id = 1;

	private String sifra;
	private Boolean obrisan;
	private String naziv;
	private Date datum;
	private String prezime;
	private String mobitel;

	public String getSifra() {
		return sifra;
	}

	public void setSifra() {
		this.sifra = idGenerator();
	}

	public Boolean getObrisan() {
		return obrisan;
	}

	public void setObrisan(Boolean obrisan) {
		this.obrisan = obrisan;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getMobitel() {
		return mobitel;
	}

	public void setMobitel(String mobitel) {
		this.mobitel = mobitel;
	}

	private String idGenerator() {
		
		return String.valueOf(id++);

	}

	@Override
	public String toString() {

		return sifra+" "+obrisan+" "+naziv+" "+datum.toString()+" "+prezime+" "+mobitel;
	}

}
