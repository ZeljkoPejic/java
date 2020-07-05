package edunova.soba;


import java.util.Date;

public class Soba {
	
	private static Integer id = 1;
	
	private String sifra;
	private Boolean zabranjen;
	private Date napravljen;
	private Date posuden;
	private String postanskiBroj;
	private Date kreiran;
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
	public Date getNapravljen() {
		return napravljen;
	}
	public void setNapravljen(Date napravljen) {
		this.napravljen = napravljen;
	}
	public Date getPosuden() {
		return posuden;
	}
	public void setPosuden(Date posuden) {
		this.posuden = posuden;
	}
	public String getPostanskiBroj() {
		return postanskiBroj;
	}
	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}
	public Date getKreiran() {
		return kreiran;
	}
	public void setKreiran(Date kreiran) {
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
	
		return sifra+" "+zabranjen+" "+napravljen.toString()+" "+posuden.toString()+" "+postanskiBroj+" "+kreiran.toString()+" "+program.toString();
	}
	
}
