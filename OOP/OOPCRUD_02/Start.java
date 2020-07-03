package edunova.student;

// 1. početak 02.07 - 21:40  ...   stop 03.07 - 1:19
// 2. početak 03.07 - 13:50  ...  (pauza 14:25 - 14:45) stop 03.07 - 15:33

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
				dovidjenja();
				return;

			}

		}

	}

	private void randomGenerator() {

		do {

			Date datum = new Date(HelpMethods.godina(), HelpMethods.mjesec(), HelpMethods.dan());
			Smjer smjer = new Smjer(smjerId++, HelpMethods.boja(), HelpMethods.mreznoMjesto(), "0982256458", 1, true);

			Student stud = new Student(studId++, datum, "K.Tomislava", new BigDecimal(1000), HelpMethods.kolicina(),
					"@maro", smjer);

			studenti.add(stud);

		} while (studId <= 20);

	}

	private void brisanjeStudenta() {

		int sifra = HelpMethods.unosBroja("Unesite sifru studenta kojeg želite obrisati");

		if (HelpMethods.prisutan("Jeste li sigurni da želite obristi studenta pod šifrom " + studenti.get(sifra - 1).getSifra())) {
			studenti.remove(sifra - 1);
			System.out.println("Student je uspješno obrisan");
		}
		

	}

	private void promjenaStudenta() {

	}

	private void ispisStudenta() {

		System.out.println("------ISPIS------");
		for (Student s : studenti) {

			System.out.println(s);

		}

	}

	private void unosStudenta() {

		Date datum = new Date(HelpMethods.unosBroja("Unesi godinu"), HelpMethods.unosBroja("Unesi mjesec"),
				HelpMethods.unosBroja("Unesi dan"));

		Student student = new Student(studId++, datum, HelpMethods.unosString("Unesi adresu"),
				HelpMethods.unosDecimal("Unesi iznos"), HelpMethods.unosDecimal("Unesi količinu"),
				HelpMethods.unosString("Unesi twitter"), unosSmjer());

		studenti.add(student);
		System.out.println("Novi student je uspješno kreiran");

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
				HelpMethods.unosString("Unesi naziv mreze"), HelpMethods.unosTelefona("Broj telefona"),
				HelpMethods.unosBroja("Unesi broj"), HelpMethods.prisutan("Prisutan Da ili Ne ?"));

		return smjer;

	}

	private void dovidjenja() {

		int suma = 0;
		System.out.println("Doviđenja");

		for (Student s : studenti) {
			suma += s.getSmjer().zbrojStringa();
			System.out.println("Količina studenta pod sifrom " + s.getSifra() + " iznosi " + s.getKolicina());
		}

		System.out.println("Zbroj svih nizova u klasi smjer iznosi: " + suma);

	}

}
