package sve;

import javax.swing.JOptionPane;

public class PrviDio {

	public static void main(String[] args) {

		boolean flag = true;

		while (flag) {

			int izbor = Integer.parseInt(JOptionPane.showInputDialog("Izaberi operaciju koju želiš: \n"
																	+ "\t 1 - Zbrajanje\n"
																	+ "\t 2 - Oduzimanje\n"
																	+ "\t 3 - Množenje\n"
																	+ "\t 4 - Dijeljenje\n"
																	+ "\t 5 - Exit"));
			
			
			JOptionPane.showMessageDialog(null, izbor);

			if (check(izbor)) {

				if (izbor == 5) {
					flag = false;
					break;

				}
				
				int brojPrvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
				int brojDrugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
						
				switch (izbor) {

				case 1:
					System.out.println(brojPrvi + " + " + brojDrugi + " = " + (brojPrvi + brojDrugi));
					break;
				case 2:
					System.out.println(brojPrvi + " - " + brojDrugi + " = " + (brojPrvi - brojDrugi));
					break;
				case 3:
					System.out.println(brojPrvi + " * " + brojDrugi + " = " + brojPrvi * brojDrugi);
					break;
				case 4:
					System.out.println(brojPrvi + " / " + brojDrugi + " = " + brojPrvi / brojDrugi);
					break;

				}

			}
	
		}

	}

	private static boolean check(int number) {

		if (number <= 5 && number >= 1) {
			return true;
		}
		return false;
		
	}

}
