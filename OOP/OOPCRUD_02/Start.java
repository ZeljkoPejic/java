package edunova.student;

// početak 02.07 - 21:40pm  ...   stop 03.07 1:19am

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {

	private int studId = 1;
	private int smjerId = 1;
	private List<Student> studenti = new ArrayList<Student>();

	public Start() {

		randomGenerator();

		while (true) {

			izbornik();

			switch (odabir()) {
			case "1":
				unosStudenta();
				break;
			case "2":
				ispisStudenta();
				break;
			case "3":
				promjenaStudenta();
				break;
			case "4":
				brisanjeStudenta();
				break;
			case "r":
				return;

			}

		}

	}

	private void randomGenerator() {

		do {

			Date datum = new Date(HelpMethods.godina(), HelpMethods.mjesec(), HelpMethods.dan());
			Smjer smjer = new Smjer(smjerId++, "crna", "tamo daleko", "0982256458", 1, true);

			Student stud = new Student(studId++, datum, "K.Tomislava", new BigDecimal(1000), new BigDecimal(500),
					"@maro", smjer);

			studenti.add(stud);

		} while (studId <= 20);

	}

	private void brisanjeStudenta() {

	}

	private void promjenaStudenta() {

	}

	private void ispisStudenta() {
		// samo test, treba nadoraditi!
		System.out.println("------ISPIS------");
		for (Student s : studenti) {

			System.out.println(s.getSifra() + " " + s.getProdan().getYear());

		}

	}

	private void unosStudenta() {
		// test unosa smjera, treba nadoraditi!
		unosSmjer();
		

	}

	public static void main(String[] args) {

		new Start();

	}

	private void izbornik() {

		System.out.println("*************************");
		System.out.println(" 1 - Unos studenta");
		System.out.println(" 2 - Ispis studenta");
		System.out.println(" 3 - Promjena studenta");
		System.out.println(" 4 - Brisanje studenta");
		System.out.println(" r - Izlaz iz aplikacije");
		System.out.println("*************************");

	}

	private String odabir() {
		String izbor;
		while (true) {
			izbor = JOptionPane.showInputDialog("Odaberi akciju");
			if (izbor.length() > 1 || izbor.trim().isEmpty() || (!izbor.matches("[1-4]+") && !izbor.equals("r"))) {
				JOptionPane.showMessageDialog(null, "Krivi odabir");
				continue;
			}
			return izbor;

		}

	}

	private Smjer unosSmjer() {

		Smjer smjer = new Smjer(smjerId++, HelpMethods.unosString("Unesi boju"),
				HelpMethods.unosString("Unesi naziv mreze"), HelpMethods.unosString("Broj telefona"),
				HelpMethods.unosBroja("Unesi broj"), HelpMethods.prisutan("Prisutan Da ili Ne ?"));

		return smjer;
		
	}

}
