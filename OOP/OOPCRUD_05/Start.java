package edunova.smjer;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;





public class Start {

	List<Smjer> smjerovi = new ArrayList<Smjer>();
	
	public Start() {
	
	
		radnomGenerator();

		while (true) {
			menu();

			switch (izbor()) {

			case "1":
				unosSmjer();
				break;
			case "2":
				ispisSmjer();
				break;
			case "3":
				promjenaSmjera();
				break;
			case "4":
				brisanjeSmjera();
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
		
		for(Smjer s: smjerovi) {
			
			System.out.println("Smjer pod šifrom "+s.getSifra()+" - Adresa: "+s.getAdresa());
			zbrojZnakova += s.getDrzava().zbrojZnakova();
			
		}
		
		System.out.println(
				"Ukupni broj svih nizova u entitetu Država koji se nalazi u entitetu Smjer iznosi: " + zbrojZnakova);
		
		
	}
		
	

	private void brisanjeSmjera() {
		
		int id;

		id = Pomoc.unosBroj("Unesi šifru smjera koju želiš obrisati");

		for (Smjer s : smjerovi) {

			if (s.getSifra().equals(id)
					&& Pomoc.provjera("Jesi li siguran da želiš obrisati? da ili ne?")) {
				
				smjerovi.remove(id - 1);
				System.out.println("Smjer je uspješno obrisana");
				return;
			}
		}
		
		
	}

	private void promjenaSmjera() {
		
		int id;

		id = Pomoc.unosBroj("Unesi šifru smjera koju želiš mijenjati");
		
		for (Smjer s : smjerovi) {

			if (s.getSifra().equals(id)){
				unosSmjer(s);
				
			}
				
		}
		
	}

	private void ispisSmjer() {
		for(Smjer s: smjerovi) {
			System.out.println(s);
		}
		
	}

	private void unosSmjer() {
	
		Smjer smjer = new Smjer();
		smjer.setSifra();
		smjer.setAdresa(Pomoc.unosString("Unesi adresu"));
		smjer.setDopusten(Pomoc.provjera("Je li doopusten? da ili ne?"));
		smjer.setNaziv(Pomoc.unosString("Unesi naziv"));
		smjer.setZabranjen(Pomoc.provjera("Je li zabranjen"));
		smjer.setProdan(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		smjer.setDrzava(unosDrzava());
		
		smjerovi.add(smjer);
		
		System.out.println("Smjer je uspješno dodan");
		
		
	}
	
	private void unosSmjer(Smjer smjer) {
		
		
		
		smjer.setAdresa(Pomoc.unosString("Unesi adresu"));
		smjer.setDopusten(Pomoc.provjera("Je li doopusten? da ili ne?"));
		smjer.setNaziv(Pomoc.unosString("Unesi naziv"));
		smjer.setZabranjen(Pomoc.provjera("Je li zabranjen"));
		smjer.setProdan(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		smjer.setDrzava(unosDrzava(smjer.getDrzava()));
		
		
		
		System.out.println("Smjer je uspješno ažuriran");
		
		
	}

	private Drzava unosDrzava() {
		
		Drzava drzava = new Drzava();
		drzava.setSifra();
		drzava.setOmogucen(Pomoc.provjera("Je li omogucen"));
		drzava.setMreznoMjesto(Pomoc.unosString("Unesi mrezno mjesto"));
		drzava.setIme(Pomoc.unosString("Unesi ime"));
		drzava.setVolumen(new BigDecimal(JOptionPane.showInputDialog("Unesi volumen")));
		drzava.setBoja(Pomoc.unosString("Unesi boju"));

		return drzava;
		
		
		
	}
	
private Drzava unosDrzava(Drzava drzava) {
		
		
		
		drzava.setOmogucen(Pomoc.provjera("Je li omogucen"));
		drzava.setMreznoMjesto(Pomoc.unosString("Unesi mrezno mjesto"));
		drzava.setIme(Pomoc.unosString("Unesi ime"));
		drzava.setVolumen(new BigDecimal(JOptionPane.showInputDialog("Unesi volumen")));
		drzava.setBoja(Pomoc.unosString("Unesi boju"));

		return drzava;
		
		
		
	}

	private String izbor() {
		return Pomoc.glavniIzbor("Odaberi akciju");
		
	}

	private void menu() {
		System.out.println("*************************");
		System.out.println(" 1 - Unos smjera");
		System.out.println(" 2 - Ispis smjera");
		System.out.println(" 3 - Promjena smjera");
		System.out.println(" 4 - Brisanje smjera");
		System.out.println(" q - Izlaz iz aplikacije");
		System.out.println("*************************");
		
	}


	
private void radnomGenerator() {
		
		do {
			Smjer smjer = new Smjer();
			smjer.setSifra();
			smjer.setAdresa(Pomoc.randomString());
			smjer.setDopusten(Pomoc.randomProvjera());
			smjer.setNaziv(Pomoc.randomNaziv());
			smjer.setZabranjen(Pomoc.randomProvjera());
			smjer.setProdan(Pomoc.randomDatum());
			smjer.setDrzava(randomDrzava());

			smjerovi.add(smjer);

		} while (smjerovi.size() < 20);
		
	}
	
	


	private Drzava randomDrzava()  {

		Drzava drzava = new Drzava();
		drzava.setSifra();
		drzava.setOmogucen(Pomoc.randomProvjera());
		drzava.setMreznoMjesto(Pomoc.randomString());
		drzava.setIme(Pomoc.randomNaziv());
		drzava.setVolumen(Pomoc.randomDeciaml());
		drzava.setBoja(Pomoc.randomString());

		return drzava;

	}

	public static void main(String[] args) {
		new Start();
	}
}
