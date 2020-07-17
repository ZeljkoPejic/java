package edunova.zgrada;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import javax.swing.JOptionPane;

public class Pomoc {

	public static String glavniIzbor(String poruka) {

		String s;
		while (true) {
			s = JOptionPane.showInputDialog(poruka);
			if (s.trim().isEmpty() || s.length() > 1 || (!s.matches("[1-4]") && !s.equals("s"))) {
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
	
	public static int unosBroj(String poruka) {
		
		while(true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(poruka));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
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

	public static LocalDate unosDatum(String poruka) {

		
		String datum;
		LocalDate date;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		while (true) {

			datum = JOptionPane.showInputDialog(poruka);

			try {
				return date = LocalDate.parse(datum, formatter);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}

		}

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

	public static boolean randomProvjera() {

		return (Math.random() >= 0.5) ? true : false;

	}

	public static String randomNaziv() {

		String[] s = new String[] { "Naz1", "Naz2", "Naz45", "Naz456", "Naz888", "Naz0" };

		return s[(int) ((Math.random() * (5 - 1)) + 1)];

	}

	

	public static String randomString() {

		String[] s = new String[] { "Omega", "Nesto", "Pero", "Mojaso", "Naztiv", "Nazovi" };

		return s[(int) ((Math.random() * (5 - 1)) + 1)];
	}

	public static String randomTelefon() {

		String[] s = new String[] { "09814578932", "0995458798", "09112457896", "0995254879", "09845789654",
				"09154236879" };

		return s[(int) ((Math.random() * (5 - 1)) + 1)];
	}

	public static String randomPostanskiBroj() {
		String[] s = new String[] { "36000", "689654", "36548", "457896", "354214",
				"36363" };

		return s[(int) ((Math.random() * (5 - 1)) + 1)];
	}
	
	public static LocalDate randomDatum() {

		String[] s = new String[] { "12-03-1991", "05-07-2000", "21-05-1998", "20-12-2005", "13-11-1990", "26-02-2012",
				"13-01-1998", "27-09-2001" };

		LocalDate date = null;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		date = LocalDate.parse(s[randomNum(8, 1)], formatter);

		return date;

	}
	
	public static String randomTwitter() {
		
		String[] s = new String[] { "@Omega", "@Nesto", "@Pero", "@Mojaso", "@Naztiv", "@Nazovi" };
		
		return s[randomNum(6, 1)];
		
	}
	
	public static BigDecimal randomDeciaml() {
		
		BigDecimal[] bg = new BigDecimal[5]; 
		
		bg[0] = new BigDecimal(1000);
		bg[1] = new BigDecimal(2500);
		bg[2] = new BigDecimal(3350);
		bg[3] = new BigDecimal(4560);
		bg[4] = new BigDecimal(6000);
		
		return bg[randomNum(5, 0)];
		
	}
	
	public static int randomNum(int max, int min) {

		return (int) (Math.random() * (max - min) + min);
	}

}

