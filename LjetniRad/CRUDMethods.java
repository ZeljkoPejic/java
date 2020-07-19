package pejic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDMethods {

	
	// CREATE
	public static void unosOsobeUBazu(String ime, String prezime, String oib) {

		try {
			PreparedStatement query = Baza.otvoriVezu()
					.prepareStatement("INSERT INTO osoba (ime,prezime,OIB)" + " VALUES (?,?,?)");

			query.setString(1, ime);
			query.setString(2, prezime);
			query.setString(3, oib);

			query.executeQuery();


		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// READ
	public static void ispisOsobaIzBaze() {

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
	public static void promjenaOsobeUBazi(int redniBroj, String ime, String prezime, String oib) {
		
		try {

			PreparedStatement query = Baza.otvoriVezu()
					.prepareStatement("UPDATE osoba SET ime=?, prezime=?, OIB=? WHERE sifra = ?");

			query.setString(1, ime);
			query.setString(2, prezime);
			query.setString(3, oib);

			query.setInt(4, redniBroj);

			query.executeUpdate();


		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	// DELETE
	public static void brisanjeOsobeUBazi(int redniBroj) {

		try {

			PreparedStatement query = Baza.otvoriVezu().prepareStatement("DELETE FROM osoba WHERE sifra = ?");

			query.setInt(1, redniBroj);

			query.executeUpdate();


		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
