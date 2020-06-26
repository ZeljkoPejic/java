package game;

import javax.swing.JOptionPane;

public class StartGame {

	public StartGame() {

		String race = JOptionPane.showInputDialog(
				"Welcome adventurer!\n " + "Choose your race\n" + "1 - Human\n" + "2 - Elf\n" + "3 - Orc");

		String name = JOptionPane.showInputDialog("Enter your name");
		String gender = JOptionPane.showInputDialog("Are you a male or female?");

		
		Player player = new Player(name, gender, new Race(race));
		JOptionPane.showMessageDialog(null, "Have fun :)\n" + player);
		
		

		

	
		
		
		//System.out.println(player);

	}

	public static void main(String[] args) {

		new StartGame();
	}

//		System.out.println("Welcome adventurer");
//		System.out.println("Choose your race:");
//		System.out.println("1 - Human");
//		System.out.println("2 - Elf");
//		System.out.println("3 - Orc");
//		System.out.println("");

}
