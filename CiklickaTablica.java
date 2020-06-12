package sve;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class CiklickaTablica {

	public static void main(String[] args) {

		int rows = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		int columns = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));

		int columnsO = columns;
		int rowsO = rows;

		int[][] table = new int[rows][columns];

		System.out.print("----------------------------------\n");
		System.out.print("|BROJ REDOVA: " + rows + " |BROJ STUPACA: " + columns + " |\n");
		System.out.print("----------------------------------\n");
		System.out.println();

				
		int counter = 1;
		boolean flagMain = true;
		int vecemanjeI = 0;
		int vecemanjeJ = 0;
		rows = rows - 1;
		columns = columns - 1;

		table: while (flagMain) {

			boolean flag1 = true;
			boolean flag2 = false;
			boolean flag3 = false;
			boolean flag4 = false;

			int i = rows;
			int j = columns;

			izlaz: for (; i >= vecemanjeI; i--) {

				while (flag2) {

					j = vecemanjeJ;
					table[i][j] = counter;
					counter++;
					if(counter==columnsO*rowsO+1){
                        break table;
                    }
					if (i == vecemanjeI) {
						flag1 = false;
						flag2 = false;
						flag3 = true;
						
					}
					break;

				}

				while (flag4) {

					j = columns;

					i++;
					table[i][j] = counter;
					counter++;
					if (i == rows - 1) { // i= 2
						flag4 = false; // Nepotrebno
						rows = rows - 1;
						columns = columns - 1;
						vecemanjeI++;
						vecemanjeJ++;

						break izlaz;

					}

				}

				for (; j >= vecemanjeJ; j--) { // j=3

					while (flag3) {

						j++;
						table[i][j] = counter;
						counter++;
						// j++;

						if (counter == columnsO * rowsO + 1) {
							break table;
						}
						if (j == columns) {

							i = vecemanjeI + 1;
							flag4 = true;
							flag3 = false;
						
						}

					}

					while (flag1) {

						table[i][j] = counter;
						counter++;
						if (j == vecemanjeJ) {
							flag1 = false;
							flag2 = true;
						}

						break;

					}

				}

			}
			if (counter == columnsO * rowsO + 1) {
				flagMain = false;
			}
		}

		for (int i = 0; i < table.length; i++) {

			for (int j = 0; j < table[i].length; j++) {

				if (j < 10) {
					System.out.print("|  " + table[i][j]);
				} else if (j >= 10 && j < 100) {
					System.out.print("| " + table[i][j]);
				} else {
					System.out.print("|" + table[i][j]);
				}
			}
			System.out.print("|");
			System.out.println();

		}

	}

}
