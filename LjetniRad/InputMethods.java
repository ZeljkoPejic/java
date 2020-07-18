package pejic.ljetnizadatak;

import java.awt.Desktop;

import java.net.URI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InputMethods {

	private static Scanner scanner = new Scanner(System.in);

	// metoda koja služi za kreiranje osobe to jest prikupljanje
	// podataka o toj osobi te proslijedi podatke kako bi se
	// izvršilo kreiranje osobe
	public static void unosOsobe() {

		String ime, prezime, oib;

		ime = unosImePrezime("Unesi ime osobe: ");
		prezime = unosImePrezime("Unesi prezime osobe: ");
		oib = unosOIB("Unesi OIB osobe: ");

		CRUDMethods.unosOsobeUBazu(ime, prezime, oib);

		System.out.println("----Osoba je uspješno kreirana----");

	}

	// metoda koja obrađuje podatke i radi provjeru je li osoba pod
	// nekih rednim brojem postoji te proslijedi podatke na
	// daljnju obradu gdje se izvršava update te osobe
	public static void promjenaOsobe() {

		try {
		int sifra = unosRedniBroj("Unesi redni broj osobe za promjenu: ");

		if (sifra == 0) {
			System.out.println("----Nepostojeća osoba----");
			return;
		}

		String ime, prezime, oib;

		ime = unosImePrezime("Unesi ime osobe za promjenu: ");
		prezime = unosImePrezime("Unesi prezime osobe za promjenu: ");
		oib = unosOIB("Unesi OIB osobe za promjenu: ");

		CRUDMethods.promjenaOsobeUBazi(sifra, ime, prezime, oib);

		System.out.println("----Promjena osobe je uspješno izvršena----");
		}catch(Exception e) {
			System.out.println("Krivi unos");
		}
	}

	// metoda koja radi provjeru je li osoba pod nekim rednim
	// brojem postoji te proslijedi taj podatak na daljnju obradu
	// za brisanje te osobe
	public static void brisanjeOsobe() {

		
		try {
		int sifra = unosRedniBroj("Unesi redni broj osobe za brisanje: ");

		if (sifra == 0) {
			System.out.println("----Nepostojeća osoba----");
			return;
		}

		CRUDMethods.brisanjeOsobeUBazi(sifra);

		System.out.println("----Osoba je uspješno obrisana----");
		}catch(Exception e) {
			System.out.println("Krivi unos");
			
		}
	}

	// metoda koja vraća ime i prezime kao String type,
	// pod uvjetom da nije prazno i da sadrži bar jedno abecedno slovo
	private static String unosImePrezime(String poruka) {

		String s;

		while (true) {

			System.out.print(poruka);
			s = scanner.nextLine();

			if (!s.isEmpty() && s.matches(".*[a-zA-Z]+.*")) {

				return s;
			}

		}

	}

	// radi provjeru OIB-a i ako je ispravan vraća ga nazad
	private static String unosOIB(String poruka) {

		String oib;

		while (true) {

			System.out.print(poruka);
			oib = scanner.nextLine();

			if (oib.isEmpty()) {
				return null;
			}

			if (oib.length() != 11) {
				System.out.println("----Krivi unos OIB-a----");
				continue;
			}

			try {
				Long.parseLong(oib);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			int a = 10;

			for (int i = 0; i < 10; i++) {
				a = a + Integer.parseInt(oib.substring(i, i + 1));
				a = a % 10;
				if (a == 0)
					a = 10;
				a *= 2;
				a = a % 11;
			}
			int kontrolni = 11 - a;
			if (kontrolni == 10) {
				kontrolni = 0;
			}

			if (kontrolni == Integer.parseInt(oib.substring(10))) {
				return oib;
			}

		}

	}

	private static int unosRedniBroj(String poruka) {

		int redniBroj;
		Integer sifra;
		String izbor = "";

		search: while (true) {

			System.out.print(poruka);
			redniBroj = scanner.nextInt();
			//scanner.nextLine();

			sifra = findSifru(redniBroj);

			if (sifra.equals(0)) {
				while (true) {
					System.out.println("Je li želite nastaviti željenu akciju? Da ili Ne?");
					izbor = scanner.nextLine();

					if (izbor.toLowerCase().equals("ne")) {
						return 0;
					} else if (izbor.toLowerCase().equals("da")) {
						continue search;
					}

				}

			}

			return sifra;

		}
	}

	private static int findSifru(Integer sifra) {

		try {

			PreparedStatement query = Baza.otvoriVezu().prepareStatement("SELECT sifra FROM osoba");

			ResultSet rs = query.executeQuery();

			while (rs.next()) {
				if (sifra.equals(rs.getRow())) {
					return rs.getInt("sifra");

				}
			}
			System.out.println("----Osoba pod rednim brojem " + sifra + " ne postoji----");

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return 0;

	}

	public static void goToAddress(String url) {

		try {
			Desktop desktop = java.awt.Desktop.getDesktop();
			URI goTo = new URI(url);
			desktop.browse(goTo);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
