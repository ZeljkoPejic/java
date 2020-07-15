package edunova.skola;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



public class Start {

	List<Skola> skole = new ArrayList<Skola>();
	
	public Start() {
		
		
		radnomGenerator();

		while (true) {
			menu();

			switch (izbor()) {

			case "1":
				unosSkola();
				break;
			case "2":
				ispisSkola();
				break;
			case "3":
				promjenaSkola();
				break;
			case "4":
				brisanjeSkola();
				break;
			case "q":
				dovidjenja();
				return;

			}

		}
		
	}
	
	private void dovidjenja() {
		
		System.out.println("Doviđenja");
		Integer zbrojZnakova=0;
		
		for(Skola s: skole) {
			
			System.out.println("Škola pod šifrom "+s.getSifra()+" - ima promjer: "+s.getPromjer());
			zbrojZnakova += s.getOtpremnica().zbrojZnakova();
			
		}
		
		System.out.println(
				"Ukupni broj svih nizova u entitetu otpremnica koji se nalazi u entitetu Škola iznosi: " + zbrojZnakova);
		
	}

	private void brisanjeSkola() {
		
		int id;

		id = Pomoc.unosBroj("Unesi šifru škole koju želiš obrisati");

		for (Skola s : skole) {

			if (s.getSifra().equals(id)
					&& Pomoc.provjera("Jesi li siguran da želiš obrisati? da ili ne?")) {
				
				skole.remove(id - 1);
				System.out.println("Škola je uspješno obrisana");
				return;
			}
		}
		
	}

	private void promjenaSkola() {

		int id;

		id = Pomoc.unosBroj("Unesi šifru smjera koju želiš mijenjati");
		
		for (Skola s : skole) {

			if (s.getSifra().equals(id)){
				unosSkola(s);
				
			}
				
		}
		
	}

	private void ispisSkola() {
		for(Skola s: skole ) {
			System.out.println(s);
		}
	}

	private void unosSkola() {
		
		Skola skola = new Skola();
		skola.setSifra();
		skola.setCijena(new BigDecimal(Pomoc.unosBroj("Unesi cijenu")));
		skola.setBoja(Pomoc.unosString("unesi boju"));
		skola.setKomada(Pomoc.unosBroj("Unesi broj"));
		skola.setPromjer(new BigDecimal(Pomoc.unosBroj("Unesi promjer")));
		skola.setVrsta(Pomoc.unosString("Unesi vrstu"));
		skola.setOtpremnica(unosOtpremnica());
		
		skole.add(skola);
		
	}
	
private void unosSkola(Skola skola) {
		
	
		
		skola.setCijena(new BigDecimal(Pomoc.unosBroj("Unesi cijenu")));
		skola.setBoja(Pomoc.unosString("unesi boju"));
		skola.setKomada(Pomoc.unosBroj("Unesi broj"));
		skola.setPromjer(new BigDecimal(Pomoc.unosBroj("Unesi promjer")));
		skola.setVrsta(Pomoc.unosString("Unesi vrstu"));
		skola.setOtpremnica(unosOtpremnica(skola.getOtpremnica()));
		
		System.out.println("Promjena je uspješna");
		
	}

	private Otpremnica unosOtpremnica() {
		
		Otpremnica otpremnica = new Otpremnica();
		otpremnica.setSifra();
		otpremnica.setAktivan(Pomoc.provjera("Je li aktivan? da ili ne?"));
		otpremnica.setOmogucen(Pomoc.provjera("Je li omogucen? da ili ne?"));
		otpremnica.setTwitter(Pomoc.unosString("Unesi twitter acc"));
		otpremnica.setTelefon(Pomoc.unosTelefona("Unesi broj telefona"));
		otpremnica.setNapravljen(Pomoc.unosDatum("Unesi datum ( oblik npr 11-05-1990 dan-mjesec-godina "));

		return otpremnica;
		
		
	}
	
private Otpremnica unosOtpremnica(Otpremnica otpremnica) {
		
		
		otpremnica.setAktivan(Pomoc.provjera("Je li aktivan? da ili ne?"));
		otpremnica.setOmogucen(Pomoc.provjera("Je li omogucen? da ili ne?"));
		otpremnica.setTwitter(Pomoc.unosString("Unesi twitter acc"));
		otpremnica.setTelefon(Pomoc.unosTelefona("Unesi broj telefona"));
		otpremnica.setNapravljen(Pomoc.unosDatum("Unesi datum ( oblik npr 11-05-1990 dan-mjesec-godina "));

		return otpremnica;
		
		
	}

	private String izbor() {
		return Pomoc.glavniIzbor("Odaberi akciju");
	}

	private void menu() {
		System.out.println("*************************");
		System.out.println(" 1 - Unos skole");
		System.out.println(" 2 - Ispis skole");
		System.out.println(" 3 - Promjena skole");
		System.out.println(" 4 - Brisanje skole");
		System.out.println(" q - Izlaz iz aplikacije");
		System.out.println("*************************");
		
	}

	private void radnomGenerator() {
		do {
			Skola skola = new Skola();
			skola.setSifra();
			skola.setCijena(Pomoc.randomDeciaml());
			skola.setBoja(Pomoc.randomNaziv());
			skola.setKomada(Pomoc.randomNum(100, 10));
			skola.setPromjer(Pomoc.randomDeciaml());
			skola.setVrsta(Pomoc.randomString());
			skola.setOtpremnica(randomOtpremnica());

			skole.add(skola);

		} while (skole.size() < 20);
		
	}

	private Otpremnica randomOtpremnica() {
		
		Otpremnica otpremnica = new Otpremnica();
		otpremnica.setSifra();
		otpremnica.setAktivan(Pomoc.randomProvjera());
		otpremnica.setOmogucen(Pomoc.randomProvjera());
		otpremnica.setTwitter(Pomoc.randomTwitter());
		otpremnica.setTelefon(Pomoc.randomTelefon());
		otpremnica.setNapravljen(Pomoc.randomDatum());

		return otpremnica;
		
	}

	public static void main(String[] args) {
		
		new Start();
		}
	
}
