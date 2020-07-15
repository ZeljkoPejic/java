package game;




import javax.swing.JOptionPane;

public class Help {

	// Methods used for inputs( name, num, string ... )
	public static String insertString(String msg) {

		String s;
		while (true) {

			s = JOptionPane.showInputDialog(msg);
			if (s.trim().isEmpty()) {
				continue;
			}

			return s;

		}

	}

	public static String enterName(String msg) {

		String s;
		while (true) {

			s = JOptionPane.showInputDialog(msg);
			if (!s.matches("[a-z]+") && s.trim().length() < 4) {
				JOptionPane.showMessageDialog(null, "Wrong input must contain min. 4 letters");
				continue;
			}

			return s;

		}

	}

	public static int insertNum(String msg) {

		while (true) {
			try {
				return Integer.parseInt(JOptionPane.showInputDialog(msg));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Wrong input");
			}
		}
	}
	// *******************************************************************

	
	
	public static void battleLog(Player player, Monster monster) {
		
		
		 JOptionPane.showMessageDialog(null, "You inflicted " + player.getStrength() + " dmg\nRecieved "
				+ monster.getStrength() + " dmg\n\nCurrent hit points: " + player.getHitPoints());
		
	}
	
	
	

	public static int randomNum(int max, int min) {

		return (int) (Math.random() * (max - min)) + min;

	}
	
	public static Boolean check(int a, int b) {
		
		return a>=b ? true : false;
	}

}
