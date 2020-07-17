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
			
			Baza.zatvoriVezu();

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
				System.out.println((redniBroj++) + ". " + rs.getString("ime") + " " + rs.getString("prezime") + " OIB: "+rs.getString("OIB"));
			}
			
			
			

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// UPDATE
	public static void promjenaOsobe() {

	}

	// DELETE
	public static void brisanjeOsobe() {
		
		ispisOsoba();
		
		
		
		try {
			
			PreparedStatement query = Baza.otvoriVezu().prepareStatement("DELETE FROM osoba WHERE sifra = ?");
			
			query.setInt(1, InputMethods.findSifru());
			
			query.executeUpdate();
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		


	}

}
