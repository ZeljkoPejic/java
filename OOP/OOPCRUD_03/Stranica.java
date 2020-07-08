package edunova.zgrada;

import java.time.LocalDate;

public class Stranica {

	private static int id = 1;

	private String sifra;
	private String ime;
	private String twitter;
	private String postanskiBroj;
	private Boolean zabranjen;
	private LocalDate prodan;

	public String getSifra() {
		return sifra;
	}

	public void setSifra() {
		this.sifra = idGenerator();
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getPostanskiBroj() {
		return postanskiBroj;
	}

	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
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

	private String idGenerator() {

		return String.valueOf(id++);

	}
	
	public int zbrojStringa() {
		
		return sifra.length()+ime.length()+twitter.length()+postanskiBroj.length();
		
		
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(sifra+" ");
		sb.append(ime+" ");
		sb.append(twitter+" ");
		sb.append(postanskiBroj+" ");
		sb.append(zabranjen+" ");
		sb.append(prodan);
		
		return sb.toString();
		
	}

}
