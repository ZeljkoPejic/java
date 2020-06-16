package sve;

import javax.swing.JOptionPane;

public class CiklickaTablica {

	static boolean check(int first, int second) {
		return first == second ? true : false;
	}

	public static void main(String[] args) {

		int rows, columns;

		while (true) {
			rows = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
			columns = Integer.parseInt(JOptionPane.showInputDialog("unesi broj stupaca"));

			if (rows > 0 && columns > 0) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Molimo unesite pozitivan broj");
			}

		}

		System.out.print("----------------------------------\n");
		System.out.print("|BROJ REDOVA: " + rows + " |BROJ STUPACA: " + columns + " |\n");
		System.out.print("----------------------------------\n");
		System.out.println();

		int[][] matrica = new int[rows][columns];
		int x = rows - 1, y = columns;
		int i = 0, a = 0, b = 0;
		int product = rows * columns;

		izlaz: while (true) {

			while (y > a) {

				matrica[x][--y] = ++i;
				if (check(i, product))
					break izlaz;

			}

			while (x > a) {

				matrica[--x][y] = ++i;
				if (check(i, product))
					break izlaz;

				if (x == a) {
					a++;
				}

			}

			while (y < columns - a) {

				matrica[x][++y] = ++i;
				if (check(i, product))
					break izlaz;
				if (y == columns - a) {
					rows = rows - 1;
				}
			}

			while (x < rows - b) {

				matrica[++x][y] = ++i;
				if (check(i, product))
					break izlaz;
				if (x == rows - 1) {
					b++;
				}

			}

		}

		for (i = 0; i < matrica.length; i++) {

			for (int j = 0; j < matrica[i].length; j++) {

				if (matrica[i][j] >= 10) {
					System.out.print(" " + matrica[i][j] + " ");
				} else {
					System.out.print(" " + matrica[i][j] + "  ");
				}
			}

			System.out.println();

		}

	}

}
