package pejic.ljetnizadatak;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;

public class PreRun {

	public PreRun() {
	
		while(true) {
		
		izbornik();
		
		
		switch(izbor()) {
		
		case 1:
			CRUDMethods.unosOsobe();
			break;
		case 2:
			CRUDMethods.ispisOsoba();
			break;
		case 3:
			break;
		case 4:
			CRUDMethods.brisanjeOsobe();
			break;
		case 5:
			idiNaEraDijagram();
			break;
		case 6:
			idiNaKodAplikacije();
			break;
		case 7:
			return;
		
		}
		
		
		}
		
	}

	private void idiNaKodAplikacije() {
		
		// TREBA DOVRŠITI KAD BUDEM PRVI PUTA PUSHAO NA GIT
		
		
	}

	// metoda te šalje na url ERA dijagrama baze u kojoj se nalazi osoba
	private void idiNaEraDijagram() {
		
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  URI eraDijagramURL = new URI("https://github.com/ZeljkoPejic/hellojp22/blob/master/era.jpg");
			  desktop.browse(eraDijagramURL);
			  
			} catch (Exception e) {
			  e.printStackTrace();
			}
		
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

	private int izbor() {
	
		while (true) {
			
			try {
			
				return Integer.parseInt(JOptionPane.showInputDialog("Odaberite akciju"));

			} catch (Exception e) {

				JOptionPane.showMessageDialog(null, "Krivi unos");

			}
		}
	}
	
	
	

}
