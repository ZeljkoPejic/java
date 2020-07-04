package edunova.soba;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Start {

	
	List<Soba> sobe = new ArrayList<Soba>();
	
	public Start() {
	
		
		while(true) {
			
			izbornik();
			
			
			switch(izbor()) {
			
			case "1":
				unosSobe();
				break;
			case "2":
				ispisSoba();
				break;
			case "3":
				promjenaSobe();
				break;
			case "4":
				brisanjeSobe();
				break;
			case "t":
				izlaz();
				return;
			
			
			}
			
			
		}
		
	
	}
	
	private String izbor() {
		
				
		return Pomoc.glavniIzbor("Odaberi akciju");
		
	}

	private void izlaz() {
		
		
		System.out.println("Doviđenja");
		
		
		
		
	}

	private void brisanjeSobe() {
		
		
	}

	private void promjenaSobe() {
		
		
	}

	private void ispisSoba() {
		
		for(Soba s : sobe) {
			
			System.out.println(s);
		}
		
	}

	private void unosSobe() {
		
		
		Soba soba= new Soba();
		
		
		
		soba.setSifra();
		soba.setZabranjen(Pomoc.provjera("Je li soba zabranjena? Da ili Ne?"));
		soba.setNapravljen(Pomoc.datum());
		soba.setPosuden(Pomoc.datum());
		soba.setPostanskiBroj(Pomoc.unosString("Unesi poštanski broj"));
		soba.setKreiran(Pomoc.datum());
		soba.setProgram(unosProgram());
		
		sobe.add(soba);
		
		System.out.println("Soba je uspješno kreirana");
		
		
		
		
	}

	private void izbornik() {
		
		System.out.println("*********************");
		System.out.println(" 1 - Unos nove sobe");
		System.out.println(" 2 - Ispis svih soba");
		System.out.println(" 3 - Promjena sobe");
		System.out.println(" 4 - Brisanje sobe");
		System.out.println(" t - Izlaz");
		System.out.println("*********************");
		
		
	}

	public static void main(String[] args) {
		
		new Start();
		
	}
	
	
	
	private Program unosProgram() {
		
		Program program = new Program();
		program.setSifra();
		program.setObrisan(Pomoc.provjera("Je li program obrisan? Da ili Ne?"));
		program.setNaziv(Pomoc.unosString("Unesi naziv za program"));
		program.setDatum(Pomoc.datum());
		program.setPrezime(Pomoc.unosString("Unesi prezime za program"));
		program.setMobitel(Pomoc.unosTelefona("Unesi broj telefona za program"));
		
		return program;
		
	}
	
	
	
}
