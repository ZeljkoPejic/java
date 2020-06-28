package game;

import javax.swing.JOptionPane;

public class StartGame {

	private Integer race;
	private String name = "";
	private Player player;

	public StartGame() {

		while (true) {

			race = Integer.parseInt(JOptionPane.showInputDialog(
					"Welcome adventurer!\n " + "Choose your race\n" + "1 - Human\n" + "2 - Elf\n" + "3 - Orc"));
			if (race <= 3 && race >= 1) {
				break;
			}

		}
		while (name.isEmpty()) {
			name = JOptionPane.showInputDialog("Enter your name");
		}

		player = new Player(name, new Race(raceChoice(race)));
		JOptionPane.showMessageDialog(null, "Have fun :)\n" + player);

		actions();

	}

	public static void main(String[] args) {

		new StartGame();
	}

	private String raceChoice(Integer choice) {

		switch (choice) {
		case 1:
			return "Human";
		case 2:
			return "Elf";
		case 3:
			return "Orc";

		}
		return null;

	}

	private void actions() {

		exitGame: while (true) {

			int choice = Integer.parseInt(JOptionPane.showInputDialog(
					"Choose your action:\n" + "\t1 - Explore\n" + "\t2 - Shop\n" + "\t3 - Boss fight"));

			int monsterHP = 50; // Monster hit points for testing
			int monsterAgi = 10; // Monster agility -||- -||-
			int monsterStr = 5; // Monster strength -||- -||-

			switch (choice) {

			case 1:

				int takeAction = Integer.parseInt(
						JOptionPane.showInputDialog("As you explore you stumble upon a monster, what will you do?\n"
								+ "	1 - Attack\n" + " 2 - Run"));
				if (takeAction == 2) {
					break;
				}

				while (true) {
					// checking if monster is faster than the player so it could attacks first
					if (monsterAgi <= player.getRace().getAgility()) { 

						monsterHP = monsterHP - player.getRace().getStrength();
						// checking if monster has some hit points left
						if (!checkHP(monsterHP)) { 
							JOptionPane.showMessageDialog(null,
									"You slayed the monster, congrats on nothing...\n jk later there will be a reward");
							break;
						}
						player.getRace().setHitPoints(player.getRace().getHitPoints() - monsterStr); 

						// checking if player has some hit points left
						if (!checkHP(player.getRace().getHitPoints())) { 
							JOptionPane.showMessageDialog(null, "Game Over");
							break exitGame;
						}
						JOptionPane.showMessageDialog(null,
								"You inflicted " + player.getRace().getStrength() + " dmg, and received " + monsterStr
										+ " dmg.\n" + "Current hit points: " + player.getRace().getHitPoints());

						takeAction = Integer.parseInt(
								JOptionPane.showInputDialog("Your move?\n" + "	1 - Keep fighting\n" + " 2 - Run"));
						if (takeAction == 2) {
							break;
						}

					} else {
						// player is receiving damage
						player.getRace().setHitPoints(player.getRace().getHitPoints() - monsterStr); 
						// checking if player has some hit points left
						if (!checkHP(player.getRace().getHitPoints())) { 
							JOptionPane.showMessageDialog(null, "Game Over");
							break exitGame;
						}

						monsterHP = monsterHP - player.getRace().getStrength();
						// checking if monster has some hit points left
						if (!checkHP(monsterHP)) { 
							JOptionPane.showMessageDialog(null,
									"You slayed the monster, congrats on nothing...\n jk later there will be a reward");
							break;
						}
						
						// Battle log
						JOptionPane.showMessageDialog(null,
								"You inflicted " + player.getRace().getStrength() + " dmg, and received " + monsterStr
										+ " dmg.\n" + "Current hit points: " + player.getRace().getHitPoints());
						// Choice to still fight or run
						takeAction = Integer.parseInt(
								JOptionPane.showInputDialog("Your move?" + "	1 - Keep fighting\n" + " 2 - Run"));
						if (takeAction == 2) {
							break;
						}

					}

				}

			case 2:
				break;
			case 3:
				break;
			}
		}

	}

	private boolean checkHP(Integer hitPoints) {

		return (hitPoints > 0) ? true : false;

	}

}
