package edunova.zgrada;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

public class Start {

	private List<Zgrada> zgrade = new ArrayList<Zgrada>();

	public Start() {

		radnomGenerator();

		while (true) {
			menu();

			switch (izbor()) {

			case "1":
				unosZgrada();
				break;
			case "2":
				ispisZgrada();
				break;
			case "3":
				promjenaZgrada();
				break;
			case "4":
				brisanjeZgrada();
				break;
			case "s":
				dovidjenja();
				return;

			}

		}

	}

	private void ispisZgrada() {

		for (Zgrada z : zgrade) {
			System.out.println(z);
		}

	}

	private void dovidjenja() {

		Integer zbrojZnakova = 0;
		System.out.println("Doviđenja");

		for (Zgrada z : zgrade) {

			zbrojZnakova += z.getStranica().zbrojStringa();
			System.out.println("Zgrada pod šifrom " + z.getSifra() + " ima opis: " + z.getOpis());

		}

		System.out.println(
				"Zbroj svih nizova u entitetu Stranica koji se nalaze u entitetu Zgrada iznosi: " + zbrojZnakova);
	}

	private void brisanjeZgrada() {

		int id;

		id = Pomoc.unosBroj("Unesi šifru zgrade koju želiš obrisati");

		for (Zgrada z : zgrade) {

			if (z.getSifra().equals(String.valueOf(id))
					&& Pomoc.provjera("Jesi li siguran da želiš obrisati? da ili ne?")) {
				
				zgrade.remove(id - 1);
				System.out.println("Zgrada je uspješno obrisana");
				return;
			}
		}

		
	}

	private void promjenaZgrada() {

		int id;

		id = Pomoc.unosBroj("Unesi šifru zgrade koju želiš mijenjati");
		
		for (Zgrada z : zgrade) {

			if (z.getSifra().equals(String.valueOf(id))){
				unosZgrada(z);
				
			}
				
		}
	}

	

	private void unosZgrada() {

		Zgrada zgrada = new Zgrada();
		zgrada.setSifra();
		zgrada.setOpseg(new BigDecimal(Pomoc.unosBroj("Unesi opseg")));
		zgrada.setOpis(Pomoc.unosString("Unesi opis"));
		zgrada.setDopusten(Pomoc.provjera("Je li zgrada dopustena? Da ili Ne?"));
		zgrada.setPrisutan(Pomoc.provjera("Je li zgrada prisutna? Da ili Ne?"));
		zgrada.setDatum(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		zgrada.setStranica(unosStranica());

		zgrade.add(zgrada);

		System.out.println("Zgrada je uspješno unesena");

	}
	
	private void unosZgrada(Zgrada zgrada) {

		
		
		zgrada.setOpseg(new BigDecimal(Pomoc.unosBroj("Unesi opseg")));
		zgrada.setOpis(Pomoc.unosString("Unesi opis"));
		zgrada.setDopusten(Pomoc.provjera("Je li zgrada dopustena? Da ili Ne?"));
		zgrada.setPrisutan(Pomoc.provjera("Je li zgrada prisutna? Da ili Ne?"));
		zgrada.setDatum(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		zgrada.setStranica(unosStranica(zgrada.getStranica()));

	
		System.out.println("Promjena je upješno obavljena");

	}

	private Stranica unosStranica() {

		Stranica stranica = new Stranica();
		stranica.setSifra();
		stranica.setIme(Pomoc.unosString("Unesi ime stranice"));
		stranica.setTwitter(Pomoc.unosString("Unesi twitter acc"));
		stranica.setPostanskiBroj(Pomoc.unosString("Unesi poštanski broj"));
		stranica.setZabranjen(Pomoc.provjera("Je li stranica zabranjena? Da ili Ne?"));
		stranica.setProdan(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));

		return stranica;

	}
	
	private Stranica unosStranica(Stranica stranica) {

		
		
		stranica.setIme(Pomoc.unosString("Unesi ime stranice"));
		stranica.setTwitter(Pomoc.unosString("Unesi twitter acc"));
		stranica.setPostanskiBroj(Pomoc.unosString("Unesi poštanski broj"));
		stranica.setZabranjen(Pomoc.provjera("Je li stranica zabranjena? Da ili Ne?"));
		stranica.setProdan(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));

		return stranica;

	}

	private String izbor() {

		return Pomoc.glavniIzbor("Odaberi akciju");
	}

	private void menu() {
		System.out.println("*************************");
		System.out.println(" 1 - Unos zgrade");
		System.out.println(" 2 - Ispis zgrada");
		System.out.println(" 3 - Promjena zgrade");
		System.out.println(" 4 - Brisanje zgrade");
		System.out.println(" s - Izlaz iz aplikacije");
		System.out.println("*************************");

	}

	private void radnomGenerator() {
		do {
			Zgrada zgrada = new Zgrada();
			zgrada.setSifra();
			zgrada.setOpseg(Pomoc.randomDeciaml());
			zgrada.setOpis(Pomoc.randomString());
			zgrada.setDopusten(Pomoc.randomProvjera());
			zgrada.setPrisutan(Pomoc.randomProvjera());
			zgrada.setDatum(Pomoc.randomDatum());
			zgrada.setStranica(randomStranica());

			zgrade.add(zgrada);

		} while (zgrade.size() < 20);

	}

	private Stranica randomStranica() {

		Stranica stranica = new Stranica();
		stranica.setSifra();
		stranica.setIme(Pomoc.randomNaziv());
		stranica.setTwitter(Pomoc.randomTwitter());
		stranica.setPostanskiBroj(Pomoc.randomPostanskiBroj());
		stranica.setZabranjen(Pomoc.randomProvjera());
		stranica.setProdan(Pomoc.randomDatum());

		return stranica;

	}

	public static void main(String[] args) {

		new Start();
	}

}
