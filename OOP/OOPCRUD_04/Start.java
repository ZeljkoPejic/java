package edunova.kategorija;

import java.util.ArrayList;
import java.util.List;




public class Start {

	
	private List<Kategorija> kategorije = new ArrayList<Kategorija>();
	
	public Start() {
	
		
		radnomGenerator();

		while (true) {
			menu();

			switch (izbor()) {

			case "1":
				unosKategorija();
				break;
			case "2":
				ispisKategorija();
				break;
			case "3":
				promjenaKategorija();
				break;
			case "4":
				brisanjeKategorija();
				break;
			case "h":
				dovidjenja();
				return;

			}

		}
		
		
		
	
	}
	
	
	private void dovidjenja() {
		
		System.out.println("Doviđenja!");
		Integer zbrojZnakova=0;
		
		for(Kategorija k: kategorije) {
			
			System.out.println("Kategorija pod šifrom "+k.getSifra()+" - prisutan: "+k.getPrisutan());
			zbrojZnakova += k.getSkola().zbrojZnakova();
			
		}
		
		System.out.println(
				"Ukupni broj svih nizova u entitetu Škola koji se nalaze u entitetu Kategorija iznosi: " + zbrojZnakova);
		
		
	}


	private void brisanjeKategorija() {
		
		int id;

		id = Pomoc.unosBroj("Unesi šifru kategorije koju želiš obrisati");

		for (Kategorija k : kategorije) {

			if (k.getSifra().equals(id)
					&& Pomoc.provjera("Jesi li siguran da želiš obrisati? da ili ne?")) {
				
				kategorije.remove(id - 1);
				System.out.println("Kategorija je uspješno obrisana");
				return;
			}
		}
		
	}


	private void promjenaKategorija() {
		
		
		int id;

		id = Pomoc.unosBroj("Unesi šifru zgrade koju želiš mijenjati");
		
		for (Kategorija k : kategorije) {

			if (k.getSifra().equals(id)){
				unosKategorija(k);
				
			}
				
		}
		
	}


	private void unosKategorija(Kategorija kategorija) {
		
		kategorija.setPosuden(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		kategorija.setPrisutan(Pomoc.provjera("Je li kategorija dopustena? Da ili Ne?"));
		kategorija.setVisina(Pomoc.unosBroj("Unesi visinu"));
		kategorija.setEmail(Pomoc.unosString("Unesi email"));
		kategorija.setBroj(Pomoc.unosBroj("Unesi broj"));
		kategorija.setSkola(unosSkola(kategorija.getSkola()));
		
		
		System.out.println("Promjena je upješno obavljena");
		
		
		
	}


	private Skola unosSkola(Skola skola) {
		
		skola.setProdan(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		skola.setKvaliteta(Pomoc.unosString("Unesi kvalitetu"));
		skola.setTwitter(Pomoc.unosString("Unesi twitter acc"));
		skola.setVrsta(Pomoc.unosString("Unesi vrstu"));
		skola.setKupljen(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		
		return skola;
		
	}


	private void ispisKategorija() {
		
		for (Kategorija k : kategorije) {
			System.out.println(k);
		}
		
	}


	private void unosKategorija() {
		
		Kategorija kategorija = new Kategorija();
		kategorija.setSifra();
		kategorija.setPosuden(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		kategorija.setPrisutan(Pomoc.provjera("Je li kategorija dopustena? Da ili Ne?"));
		kategorija.setVisina(Pomoc.unosBroj("Unesi visinu"));
		kategorija.setEmail(Pomoc.unosString("Unesi email"));
		kategorija.setBroj(Pomoc.unosBroj("Unesi broj"));
		kategorija.setSkola(unosSkola());

		kategorije.add(kategorija);

		System.out.println("kategorija je uspješno unesena");
		
		
	}
	
	private Skola unosSkola() {

		Skola skola = new Skola();
		skola.setSifra();
		skola.setProdan(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));
		skola.setKvaliteta(Pomoc.unosString("Unesi kvalitetu"));
		skola.setTwitter(Pomoc.unosString("Unesi twitter acc"));
		skola.setVrsta(Pomoc.unosString("Unesi vrstu"));
		skola.setKupljen(Pomoc.unosDatum("Unesi datum\n( oblik npr 11-05-1990 dan-mjesec-godina )"));

		return skola;

	}


	private String izbor() {
		
		return Pomoc.glavniIzbor("Odaberi akciju");
	}


	private void menu() {
		System.out.println("*************************");
		System.out.println(" 1 - Unos kategorije");
		System.out.println(" 2 - Ispis kategorija");
		System.out.println(" 3 - Promjena kategorije");
		System.out.println(" 4 - Brisanje kategorije");
		System.out.println(" h - Izlaz iz aplikacije");
		System.out.println("*************************");
		
	}


	private void radnomGenerator() {
		
		do {
			Kategorija kategorija = new Kategorija();
			kategorija.setSifra();
			kategorija.setPosuden(Pomoc.randomDatum());
			kategorija.setPrisutan(Pomoc.randomProvjera());
			kategorija.setVisina(Pomoc.randomNum(210, 150));
			kategorija.setEmail(Pomoc.randomTwitter());
			kategorija.setBroj(Pomoc.randomNum(10000, 1000));
			kategorija.setSkola(randomSkola());

			kategorije.add(kategorija);

		} while (kategorije.size() < 20);
		
	}
	
	private Skola randomSkola() {

		Skola skola = new Skola();
		skola.setSifra();
		skola.setProdan(Pomoc.randomDatum());
		skola.setKvaliteta(Pomoc.randomTwitter());
		skola.setTwitter(Pomoc.randomPostanskiBroj());
		skola.setVrsta(Pomoc.randomString());
		skola.setKupljen(Pomoc.randomDatum());

		return skola;

	}


	public static void main(String[] args) {
		
		new Start();
		
	}
}
