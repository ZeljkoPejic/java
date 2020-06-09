package edunova;

import javax.swing.JOptionPane;

public class DZ02 {

	private static void sirina(int n) {

		// char minus = '-';
		n = 4 + (3 * n);

		for (int i = 0; i < n; i++) {

			System.out.print('-');

		}
		System.out.println();

	}

	private static void naslov(int n) {

		n = 4 + (3 * n);
		if (n <= 13) {
			if (n > 10) {
				System.out.println("  TAB  MNOZ  ");
			} else {
				System.out.println(" TAB MNOZ ");
			}

		} else if (n <= 16) {

			System.out.println("TABLICA MNOZENJA");

		} else if (n <= 19) {

			System.out.println(" TABLICA  MNOZENJA ");

		} else {

			if (n % 2 == 0) {

				n = (n / 2) - 8;

				if (n % 2 == 0) {

					for (int i = 0; i < n / 2; i++) {
						System.out.print(": ");
					}
					System.out.print("TABLICA MNOZENJA");
					for (int i = 0; i < n / 2; i++) {
						System.out.print(" :");
					}
				} else {
					System.out.print(" ");
					for (int i = 0; i < n / 2; i++) {
						System.out.print(": ");
					}
					System.out.print("TABLICA MNOZENJA");
					for (int i = 0; i < n / 2; i++) {
						System.out.print(" :");
					}
					System.out.print(" ");

				}
			} else {

				n = (n / 2) - 8;

				if (n % 2 == 0) {

					for (int i = 0; i < n / 2; i++) {
						System.out.print(": ");
					}
					System.out.print("TABLICA  MNOZENJA");
					for (int i = 0; i < n / 2; i++) {
						System.out.print(" :");
					}
				} else {
					System.out.print(" ");
					for (int i = 0; i < n / 2; i++) {
						System.out.print(": ");
					}
					System.out.print("TABLICA  MNOZENJA");
					for (int i = 0; i < n / 2; i++) {
						System.out.print(" :");
					}

					System.out.print(" ");

				}
			}

			System.out.println();
		}

	}

	private static void kreator(int n, String ime) {

		n = 4 + (3 * n);
		if (n < 13) {
			if (n >= 10) {
				System.out.print("by " + ime);
				System.out.println();
			} else {
				System.out.print(": by  " + ime);
				System.out.println();
			}

		} else {

			n = n - (3 + ime.length());
			if (n % 2 == 0) {
				for (int i = 0; i < n; i += 2) {
					System.out.print(": ");

				}
				System.out.println("by " + ime);
			}else {
				System.out.print(" ");
				for (int i = 1; i < n; i += 2) {
					System.out.print(": ");

				}
				System.out.println("by " + ime);
			}

		}

	}

	public static void main(String[] args) {

		boolean flag = true;
		int rows = 0;
		int columns = 0;
		String ime = "";

		while (flag) {

			rows = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
			columns = Integer.parseInt(JOptionPane.showInputDialog("unesi drugi broj"));
			ime = JOptionPane.showInputDialog("Ime kreatora");

			if (rows > 1 && columns > 1) {
				flag = false;
			}
		}

		sirina(columns);
		naslov(columns);
		sirina(columns);

		System.out.print(" * |");
		for (int i = 1; i <= columns; i++) {
			if (i < 10) {
				System.out.print("  " + i);
			} else {
				System.out.print(" " + i);
			}
		}

		System.out.println();
		sirina(columns);

		for (int i = 0; i < rows; i++) {
			
			if(i>=9) {
				System.out.print((i + 1) + " | ");
			}else {
				System.out.print(" " + (i + 1) + " | ");
			}
			
			for (int j = 0; j < columns; j++) {

				if ((i + 1) * (j + 1) < 10) {
					System.out.print(" " + (i + 1) * (j + 1) + " ");
				} else {
					System.out.print((i + 1) * (j + 1) + " ");
				}

			}
			System.out.println();
		}

		sirina(columns);
		kreator(columns, ime);
		sirina(columns);

	}

}
