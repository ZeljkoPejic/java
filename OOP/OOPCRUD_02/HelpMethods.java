package edunova.student;

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
			if(izbor.trim().isEmpty()){
				JOptionPane.showMessageDialog(null,	"Krivi unos");
				continue;
			}
			return izbor;
			
		}

	}
	
	public static boolean prisutan(String poruka) {
		
		String s;
		while(true) {
		
			s = JOptionPane.showInputDialog(poruka);
			if(s.toLowerCase().equals("da")) {
				return true;
			}else if(s.toLowerCase().equals("ne")) {
				return false;
			}else {
				JOptionPane.showMessageDialog(null, "Krivi unos");
			}
			
			
		
		}
	}

}
