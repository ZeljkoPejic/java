package pejic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class CRUDMethods {

	// CREATE
	public static void unosOsobe() {

		try {
			PreparedStatement query = Baza.otvoriVezu()
					.prepareStatement("INSERT INTO osoba (ime,prezime,OIB)" + " VALUES (?,?,?)");

			query.setString(1, InputMethods.unosImePrezime("Unesi ime osobe"));
			query.setString(2, InputMethods.unosImePrezime("Unesi prezime osobe"));
			query.setString(3, InputMethods.unosOIB("Unesi OIB osobe"));

			query.executeQuery();

			JOptionPane.showMessageDialog(null, "Osoba je uspješno kreirana");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// READ
	public static void ispisOsoba() {

		int redniBroj = 1;

		try {

			PreparedStatement query = Baza.otvoriVezu().prepareStatement("SELECT * FROM osoba;");

			ResultSet rs = query.executeQuery();

			while (rs.next()) {
				System.out.println((redniBroj++) + ". " + rs.getString("ime") + " " + rs.getString("prezime") + " OIB: "
						+ rs.getString("OIB"));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// UPDATE
	public static void promjenaOsobe() {

		ispisOsoba();
		int redniBroj = InputMethods.findSifru("Unesi redni broj osobe za promjenu");

		try {

			PreparedStatement query = Baza.otvoriVezu()
					.prepareStatement("UPDATE osoba SET ime=?, prezime=?, OIB=? WHERE sifra = ?");

			query.setString(1, InputMethods.unosImePrezime("Unesi novo ime osobe"));
			query.setString(2, InputMethods.unosImePrezime("Unesi novo prezime osobe"));
			query.setString(3, InputMethods.unosOIB("Unesi novi OIB osobe"));

			query.setInt(4, redniBroj);

			query.executeUpdate();

			JOptionPane.showMessageDialog(null, "Promjena osobe je uspješno izvršena");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// DELETE
	public static void brisanjeOsobe() {

		ispisOsoba();

		try {

			PreparedStatement query = Baza.otvoriVezu().prepareStatement("DELETE FROM osoba WHERE sifra = ?");

			query.setInt(1, InputMethods.findSifru("Unesi redni broj osobe za brisanje"));

			query.executeUpdate();

			JOptionPane.showMessageDialog(null, "Osoba je uspješno obrisana");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
