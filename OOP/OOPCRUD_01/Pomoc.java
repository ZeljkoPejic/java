package edunova.soba;

import java.text.DateFormat;
import java.text.ParseException;
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

	public static Date datum() {

//		SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
//		Date dat = new Date();
//		dat.
//		date.format(dat);
//
//		return dat;
		
		
		SimpleDateFormat dat = new SimpleDateFormat("dd-MM-yyyy");	
		Date datum = new Date();
		datum = dat.get2DigitYearStart();
		return datum;

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

	public static Date randomDatum() {

//		SimpleDateFormat dat = new SimpleDateFormat("dd-MM-yyyy");
//		Date datum = new Date();
//		dat.format(datum);
//
//		return datum;
		
		String[] s = new String[] {"12-03-1991","05-07-2000","21-05-1998","20-12-2005","13-11-1990","26-02-2012"};
		
		Date d = stringToDateReport(s[(int)(Math.random() * 6 )]);
		
		
		return  d;
		

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
	
	public static Date stringToDateReport(String s){
	    DateFormat format;
	    Date date = null;

	    format = new SimpleDateFormat("dd-MM-yyyy");

	    if(s.length()==4) {
	        format = new SimpleDateFormat("yyyy");
	    }
	    try {
	        date = (Date)format.parse(s);
	    } catch (ParseException e) {
	        
	        e.printStackTrace();
	    }
	    return date;
	}

}
