package edunova.soba;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Pomoc {

	public static String glavniIzbor(String poruka) {

		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty() || s.length() > 1 || (!s.matches("[1-4]") && !s.equals("t"))) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}

			return s;

		}

	}

	public static String unosString(String poruka) {

		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}

			return s;

		}

	}

	public static boolean provjera(String poruka) {

		String s;

		while (true) {
			s = JOptionPane.showInputDialog(poruka);

			if (s.toLowerCase().equals("da")) {
				return true;
			} else if (s.toLowerCase().equals("ne")) {
				return false;
			} else {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}

	}

	public static SimpleDateFormat datum() {

		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
		
		 return date;
		
		
		
	}
	
	public static String unosTelefona(String poruka) {

		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty() && !s.matches("[0-9]")) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}

			return s;

		}

	}

}
