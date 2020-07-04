package edunova.soba;

import java.text.SimpleDateFormat;

public class Soba {
	
	private static Integer id = 1;
	
	private String sifra;
	private Boolean zabranjen;
	private SimpleDateFormat napravljen;
	private SimpleDateFormat posuden;
	private String postanskiBroj;
	private SimpleDateFormat kreiran;
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
	public SimpleDateFormat getNapravljen() {
		return napravljen;
	}
	public void setNapravljen(SimpleDateFormat napravljen) {
		this.napravljen = napravljen;
	}
	public SimpleDateFormat getPosuden() {
		return posuden;
	}
	public void setPosuden(SimpleDateFormat posuden) {
		this.posuden = posuden;
	}
	public String getPostanskiBroj() {
		return postanskiBroj;
	}
	public void setPostanskiBroj(String postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}
	public SimpleDateFormat getKreiran() {
		return kreiran;
	}
	public void setKreiran(SimpleDateFormat kreiran) {
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
	
		return sifra+" "+zabranjen+" "+napravljen.toLocalizedPattern()+" "+posuden.toLocalizedPattern()+" "+postanskiBroj+" "+kreiran.toLocalizedPattern()+" "+program.toString();
	}
	
}
