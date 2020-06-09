package edunova;

import javax.swing.JOptionPane;

public class ZD02 {

	public static void main(String[] args) {

		boolean flag = true;

		while (flag) {

			int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj od 1 do 5"));

			if (broj > 5 || broj < 1) {
				
				System.out.println("Nije dobar broj, unesi opet");
			} else {

				flag = false;
				switch (broj) {
				case 1:
					System.out.println("Nedovoljan");
					break;
				case 2:
					System.out.println("Dovoljan");
					break;
				case 3:
					System.out.println("Dobar");
					break;
				case 4:
					System.out.println("Vrlo dobar");
					break;
				case 5:
					System.out.println("Odličan");
					break;

				}
			}
		}
	}
}
