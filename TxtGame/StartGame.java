package game;

import javax.swing.JOptionPane;

public class StartGame {

	private int race;
	private String name = "";
	private Player player;

	public StartGame() {

		while (true) {

			race = Input.enterNumber(
					"Welcome adventurer!\n " + "Choose your race\n" + "1 - Human\n" + "2 - Elf\n" + "3 - Orc");

			if (race <= 3 && race >= 1) {
				break;
			}

		}

		name = Input.enterString("Enter your name");

		player = new Player(name, new Race(raceChoice(race)));
		JOptionPane.showMessageDialog(null, "Have fun :)\n" + player);

		actions();

	}

	// MAIN---------------------------------MAIN
	public static void main(String[] args) {

		new StartGame();
	}
	// MAIN---------------------------------MAIN

	private String raceChoice(Integer choice) {

		switch (choice) {
		case 1:
			return "Human";
		case 2:
			return "Elf";
		case 3:
			return "Orc";
		default:
			return null;
		}

	}

	private void actions() {

		exitGame: while (true) {

			int choice = Input.enterNumber("Choose your action:\n" + "\t1 - Explore\n" + "\t2 - Shop\n" + "\t3 - Boss fight\n" + "\t4 - Exit Game");

			Monster monster = new Monster(50, 50, 10, 5, "Goblin");
			
			int monsterHP = monster.getHitPoints(); 
			

			switch (choice) {

			case 1:
		
				Integer takeAction = Input.enterNumber("As you explore you stumble upon a monster( "+monster.getName()+" ), what will you do?\n" + "	1 - Attack\n" + " 2 - Run");
				
				if (takeAction.equals(2)) {
					break;
				}

				while (true) {
					// checking if monster is faster than the player so it could attacks first
					if (monster.getAgility() <= player.getRace().getAgility()) {

						monsterHP = monsterHP - player.getRace().getStrength();
						// checking if monster has some hit points left
						if (!checkHP(monsterHP)) {
							JOptionPane.showMessageDialog(null,
									"You slayed the monster, congrats on nothing...\n jk later there will be a reward");
							break;
						}
						player.getRace().setHitPoints(player.getRace().getHitPoints() - monster.getStrength());

						// checking if player has some hit points left
						if (!checkHP(player.getRace().getHitPoints())) {
							JOptionPane.showMessageDialog(null, "Game Over");
							break exitGame;
						}
						// Battle log
						JOptionPane.showMessageDialog(null,
								"You inflicted " + player.getRace().getStrength() + " dmg, and received " + monster.getStrength()
										+ " dmg.\n" + "Current hit points: " + player.getRace().getHitPoints());

						takeAction = Integer.parseInt(
								JOptionPane.showInputDialog("Your move?\n" + "	1 - Keep fighting\n" + " 2 - Run"));
						if (takeAction == 2) {
							break;
						}

					} else {
						// player is receiving damage
						player.getRace().setHitPoints(player.getRace().getHitPoints() - monster.getStrength());
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
								"You inflicted " + player.getRace().getStrength() + " dmg, and received " + monster.getHitPoints()
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
			case 4:
				break exitGame;
			}
		}

	}

	private boolean checkHP(Integer hitPoints) {

		return (hitPoints > 0) ? true : false;

	}
	
	private void battleLog() {
		
		
		
		
	}

}
