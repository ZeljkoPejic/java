package edunova.soba;


import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {

	List<Soba> sobe = new ArrayList<Soba>();

	public Start() {
		
		randomGenerator();

		while (true) {

			izbornik();

			switch (izbor()) {

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
	
	private void randomGenerator() {
		
		do {
			
			sobe.add(randomUnosSobe());
			
		}while(sobe.size()<20);
		
		
	}

	private String izbor() {

		return Pomoc.glavniIzbor("Odaberi akciju");

	}

	private void izlaz() {

		System.out.println("Doviđenja");
		for(Soba s : sobe) {
			
			System.out.println("Soba pod šifrom "+s.getSifra()+" posuden: "+s.getPosuden());
			
		}
		

	}

	private void brisanjeSobe() {

		int id = Pomoc.unosBroj("Unesi šifru osobe koju želiš obrisati");

		for (Soba s : sobe) {

			if (s.getSifra().equals(String.valueOf(id))
					&& Pomoc.provjera("Jesi li siguran da želiš obrisati sobu pod šifrom " + s.getSifra())) {
				sobe.remove(id - 1);
				System.out.println("Soba je obrisana!");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Soba pod šifrom "+id+" ne postoji");

	}

	private void promjenaSobe() {

	}

	private void ispisSoba() {

		for (Soba s : sobe) {

			System.out.println(s);
		}

	}

	private void unosSobe() {

		Soba soba = new Soba();

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

	public static void main(String[] args){

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
	
	private Program randomUnosProgram()  {

		Program program = new Program();
		program.setSifra();
		program.setObrisan(Pomoc.randomProvjera());
		program.setNaziv(Pomoc.randomNaziv());
		program.setDatum(Pomoc.randomDatum());
		program.setPrezime(Pomoc.randomString());
		program.setMobitel(Pomoc.randomTelefon());

		return program;

	}
	
	private Soba randomUnosSobe() {
		
		Soba soba = new Soba();
		soba.setSifra();
		soba.setZabranjen(Pomoc.randomProvjera());
		soba.setNapravljen(Pomoc.randomDatum());
		soba.setPosuden(Pomoc.randomDatum());
		soba.setPostanskiBroj(Pomoc.randomPostanskiBroj());
		soba.setKreiran(Pomoc.randomDatum());
		soba.setProgram(randomUnosProgram());
		
		return soba;
		
	}

}
