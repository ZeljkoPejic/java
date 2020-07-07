package edunova.soba;


import java.time.LocalDate;


public class Soba {
	
	private static Integer id = 1;
	
	private String sifra;
	private Boolean zabranjen;
	private LocalDate napravljen;
	private LocalDate posuden;
	private String postanskiBroj;
	private LocalDate kreiran;
	private Program program;
	
	
	
	public String getSifra() {
		return sifra;
	}
	public void setSifra() {
		this.sifra = idGenerator();
	}
	public Boolean getZabranjen() {
		return zabranjen;
	}
	public void setZabranjen(Boolean zabranjen) {
		this.zabranjen = zabranjen;
	}
	public LocalDate getNapravljen() {
		return napravljen;
	}
	public void setNapravljen(LocalDate napravljen) {
		this.napravljen = napravljen;
	}
	public LocalDate getPosuden() {
		return posuden;
	}
	public void setPosuden(LocalDate posuden) {
		this.posuden = posuden;
	}
	public String getPostanskiBroj() {
		return postanskiBroj;
	}
	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}
	public LocalDate getKreiran() {
		return kreiran;
	}
	public void setKreiran(LocalDate kreiran) {
		this.kreiran = kreiran;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	

	
	private String idGenerator() {
		
		
		return String.valueOf(id++);
		
	}
	
	
	
	
	@Override
	public String toString() {
	
		return sifra+" "+zabranjen+" "+napravljen+" "+posuden+" "+postanskiBroj+" "+kreiran+" "+program.toString();
	}
	
}
