package pejic.ljetnizadatak;

import java.awt.Desktop;
import java.net.URI;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class InputMethods {

	public static String unosImePrezime(String poruka) {

		String s;

		while (true) {

			s = JOptionPane.showInputDialog(poruka);

			// na ovome treba poraditi
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

	private static int unosRedniBroj(String poruka) {

		while (true) {

			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}

		}

	}

	public static int findSifru(String poruka) {

		Integer a;

		while (true) {

			try {

				a = unosRedniBroj(poruka);

				PreparedStatement query = Baza.otvoriVezu().prepareStatement("SELECT sifra FROM osoba");

				ResultSet rs = query.executeQuery();

				while (rs.next()) {
					if (a.equals(rs.getRow())) {
						return rs.getInt("sifra");

					}
				}
				JOptionPane.showMessageDialog(null, "Osoba pod rednim brojem " + a + " ne postoji");

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void goToAddress(String url) {

		try {
			Desktop desktop = java.awt.Desktop.getDesktop();
			URI eraDijagramURL = new URI(url);
			desktop.browse(eraDijagramURL);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
