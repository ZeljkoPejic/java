package edunova.student;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class HelpMethods {

	public static int godina() {

		return (int) (Math.random() * ((2020 - 2000) + 1)) + 2000;

	}

	public static int mjesec() {

		return (int) (Math.random() * ((12 - 1) + 1)) + 1;

	}

	public static int dan() {

		return (int) (Math.random() * ((31 - 1) + 1)) + 1;

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

	public static String unosString(String poruka) {
		String izbor;
		while (true) {
			izbor = JOptionPane.showInputDialog(poruka);
			if (izbor.trim().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}
			return izbor;

		}

	}

	public static String unosTelefona(String poruka) {
		String izbor;
		while (true) {
			izbor = JOptionPane.showInputDialog(poruka);
			if (izbor.trim().isEmpty() || !izbor.matches("[0-9]+")) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
				continue;
			}
			return izbor;

		}

	}

	public static boolean prisutan(String poruka) {

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

	public static BigDecimal unosDecimal(String poruka) {

		while (true) {
			try {
				return new BigDecimal(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
		}
	}
	
	public static String boja() {
		
		String[] boje = new String[] {"Crvena","Plava","Crna","Roza","Bijela"};
		
		return boje[(int)(Math.random()*((4 - 0) + 1)) + 0];
		
		
	}
	
	public static BigDecimal kolicina() {
		
		return new BigDecimal((int) (Math.random() * ((10000 - 1000) + 1)) + 1000);
	}
	
	public static String mreznoMjesto() {
		
		String[] mjesto = new String[] {"mix457","blizu","5d6a7l8j","tu","kafe"};
		
		return mjesto[(int)(Math.random()*((4 - 0) + 1)) + 0];
		
	}
}
