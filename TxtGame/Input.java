package game;

import javax.swing.JOptionPane;

public class Input {

	public static String enterString(String msg) {
		String s;

		while (true) {

			s = JOptionPane.showInputDialog(msg);
			if (s.isEmpty() || s.trim().length() < 4) {
				JOptionPane.showMessageDialog(null, "Wrong input");
				continue;
			}

			return s;

		}

	}

	public static int enterNumber(String msg) {

		while (true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(msg));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Wrong input");
			}
		}
	}

}
