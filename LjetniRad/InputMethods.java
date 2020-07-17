package pejic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class InputMethods {

	public static String unosImePrezime(String poruka) {

		String s;

		while (true) {

			s = JOptionPane.showInputDialog(poruka);

			if (s.matches("[A-z]+")) {
				return s;
			}

			JOptionPane.showMessageDialog(null, "Krivi unos");

		}

	}

	public static String unosOIB(String poruka) {

		String s;

		while (true) {

			s = JOptionPane.showInputDialog(poruka);

			if (s.matches("[0-9]+") && s.length() == 11) {
				return s;
			} else if (s.isEmpty()) {
				return null;
			}

			JOptionPane.showMessageDialog(null, "Krivi unos OIB-a");

		}

	}

	public static int unosBroja(String poruka) {

		while (true) {

			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}

		}

	}

	public static int findSifru() {

		Integer a;

		try {

			
			a = unosBroja("Unesi redni broj osobe za brisanje");

			PreparedStatement query = Baza.otvoriVezu().prepareStatement("SELECT sifra FROM osoba");

			ResultSet rs = query.executeQuery();

			while (rs.next()) {
				if (a.equals(rs.getRow())) {
					return rs.getInt("sifra");
					
				}

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

}
