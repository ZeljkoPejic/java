package pejic.ljetnizadatak;

public class PreRun {

	public PreRun() {

		while (true) {

			izbornik();

			switch (InputMethods.izbor()) {

			case 1:
				InputMethods.unosOsobe();
				;
				break;
			case 2:
				CRUDMethods.ispisOsobaIzBaze();
				break;
			case 3:
				InputMethods.promjenaOsobe();
				break;
			case 4:
				InputMethods.brisanjeOsobe();
				break;
			case 5:
				idiNaEraDijagram();
				break;
			case 6:
				idiNaKodAplikacije();
				break;
			case 7:
				Baza.zatvoriVezu();
				return;

			}

		}

	}

	// metoda te šalje na url foldera sa kodom aplikacije
	private void idiNaKodAplikacije() {

		InputMethods.goToAddress("https://github.com/ZeljkoPejic/java/tree/master/LjetniRad");

	}

	// metoda te šalje na url ERA dijagrama baze u kojoj se nalazi osoba
	private void idiNaEraDijagram() {

		InputMethods.goToAddress("https://github.com/ZeljkoPejic/hellojp22/blob/master/era.jpg");

	}

	// ispis mogućih akcija( odabira ) aplikacije
	private void izbornik() {

		System.out.println("******************************");
		System.out.println(" 1 - Unos nove osobe");
		System.out.println(" 2 - Izlistaj sve osobe");
		System.out.println(" 3 - Promjena podataka osobe");
		System.out.println(" 4 - Brisanje osobe");
		System.out.println(" 5 - Idi na ERA dijagram baze");
		System.out.println(" 6 - Idi na kod aplikacije");
		System.out.println(" 7 - Izlaz iz aplikacije");
		System.out.println("******************************");

	}

	

}
