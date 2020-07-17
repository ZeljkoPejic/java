package pejic.ljetnizadatak;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {

		Integer a;

		try {

			a = unosBroja("Unesi redni broj osobe za brisanje");

			PreparedStatement query = Baza.otvoriVezu().prepareStatement("SELECT sifra FROM osoba");

			ResultSet rs = query.executeQuery();

			if (a.equals(rs.getRowId(1))) {
				
				System.out.println("isti su");

			}
			
			System.out.println("nisu isti ili ne postoji");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

}
