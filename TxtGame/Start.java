package game;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Start {

	Player player = createPlayer();
	private Integer score;
	List<Monster> monsters = new ArrayList<Monster>();
	List<Monster> bosses = new ArrayList<Monster>();
	List<Level> levels = new ArrayList<Level>();

	public Start() {

		generateWorld();

		while (true) {

			switch (Help.insertNum(menu())) {

			case 1:
				explore();
				break;
			case 2:
				tavern();
				break;
			case 3:
				bossFight();
				break;
			case 4:
				playerInfo();
				break;
			case 5:
				goodBye();
				return;

			}

		}

	}

	private void playerInfo() {
		
		JOptionPane.showMessageDialog(null, player);

	}

	private void goodBye() {

		JOptionPane.showMessageDialog(null, "Thanks for playing\n Final score: " + score);

	}

	private void bossFight() {

	}

	private void tavern() {
		
		int choice =  Help.insertNum("Welcome adventurer! How can i help you?\n 1 - Buy\n 2 - Sell \n 3 - Rest\n 4 - Leave");
		
		
		while(true) {
			
			
			
		switch(choice) {
		
		case 1:
			break;
		case 2:
			break;
		case 3:
			rest();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Good hunting adventurer, come back soon!");
			return;
		}
		
		choice =  Help.insertNum("Need something else?\n 1 - Buy\n 2 - Sell \n 3 - Rest\n 4 - Leave");
		
		}
	}

	// need to rework so it cant get over maxHp
	private void rest() {
		
		if(player.getHitPoints()>=90) {
			JOptionPane.showMessageDialog(null, "You took a nap");
			return;
		}
		
		player.setHitPoints(player.getHitPoints()+10);
		JOptionPane.showMessageDialog(null, "You took a nap, some of your HP is restored");
		
	}

	private void explore() {

		Integer choice;
		int rand = Help.randomNum(10, 1);
		
		if (rand <= 8) {
			choice = Help.insertNum("You stumble upon a monster ? what will you do?\n(If u choose to fight you may later have prob to runaway)\n 1 - Fight\n 2 - Run");

			if (choice.equals(1)) {

				fightOrRun();
		
			} 
				return;
			

		} else {
			int gold = Help.randomNum(5, 1);
			player.setGold(player.getGold() + gold);
			JOptionPane.showMessageDialog(null, "You found a treasure chest!\nGained " + gold + " gold");
		}

	}

	private Player createPlayer() {

		Player p = new Player();
		p.setName(Help.enterName("Enter your name"));
		p.setGold(10);
		p.setLevel(new Level(1, 0));
		p.setRace(new Race(Help.enterName("Enter name for your race")));
		p.setHitPoints(100);
		p.setStrength(10);
		p.setAgility(10);
		p.setIntelligence(10);

		JOptionPane.showMessageDialog(null, "Player created\n\n" + p.toString());

		return p;

	}

	private String menu() {

		StringBuilder sb = new StringBuilder();
		sb.append("Choose your action\n");
		sb.append(" 1 - Explore\n");
		sb.append(" 2 - Tavern\n");
		sb.append(" 3 - Boss fight\n");
		sb.append(" 4 - Player info\n");
		sb.append(" 5 - Exit Game");

		return sb.toString();

	}

	private void generateWorld() {

		// generate monsters
		Monster m = new Monster(50, 5, 10, 5, "Lapuu");
		monsters.add(m);
		m = new Monster(40, 6, 11, 5, "Jellyko");
		monsters.add(m);
		m = new Monster(80, 2, 2, 5, "Opyium");
		monsters.add(m);
		m = new Monster(100, 3, 12, 2, "Huynd");
		monsters.add(m);
		m = new Monster(120, 2, 1, 8, "Grundzz");
		monsters.add(m);
		m = new Monster(65, 4, 14, 6, "Apelion");
		monsters.add(m);
		m = new Monster(25, 15, 1, 3, "Izgoris");
		monsters.add(m);
		m = new Monster(150, 10, 1, 1, "Pbidu");
		monsters.add(m);

		// generate Boss monsters
		m = new Monster(250, 13, 15, 8, "Lizi");
		bosses.add(m);
		m = new Monster(320, 15, 20, 11, "Luni");
		bosses.add(m);
		m = new Monster(350, 17, 22, 7, "Lunjo");
		bosses.add(m);
		m = new Monster(360, 19, 22, 6, "Lui");
		bosses.add(m);
		m = new Monster(450, 25, 12, 8, "Loro");
		bosses.add(m);

		// generate Levels
		Level level = new Level(1, 1000);
		levels.add(level);
		level = new Level(2, 2500);
		levels.add(level);
		level = new Level(3, 5000);
		

	}

	// ---------------------------------
	// Methods used for EXPLORE action
	// ---------------------------------
	public void fightOrRun() {

		Monster monster = monsters.get(Help.randomNum(8, 1));
		Integer monsterHp = monster.getHitPoints();
		System.out.println("You stumble upon monster - " + monster.getName());

		// if you choose to FIGHT
		while (player.getHitPoints() > 0 && monsterHp > 0) {

			// monster atks first
			if (monster.getAgility() > player.getAgility()) {

				player.setHitPoints(player.getHitPoints() - monster.getStrength());
				monsterHp = monsterHp - player.getStrength();

				Help.battleLog(player, monster);
				
				if (monsterHp <= 0) {
					score+=50;
					JOptionPane.showMessageDialog(null, "You slayed " + monster.getName());
					return;
				}

			}

			// player atks first
			if (monster.getAgility() < player.getAgility()) {

				monsterHp = monsterHp - player.getStrength();
				if (monsterHp > 0) {
					player.setHitPoints(player.getHitPoints() - monster.getStrength());
				} else {
					score+=50;
					JOptionPane.showMessageDialog(null, "You slayed " + monster.getName());
					return;
				}

				Help.battleLog(player, monster);

			}

			if (Help.insertNum("What will youd do?\n 1 - Keep fighting\n 2 - Run") == 2) {
				if(player.getAgility()+Help.randomNum(3, 1) > monster.getAgility()) {
					return;
				}else {
					player.setHitPoints(player.getHitPoints() - monster.getStrength());
					JOptionPane.showMessageDialog(null, "You failed to run...\nRecieved "+monster.getStrength()+" dmg");
				}
				
			}

		}
		JOptionPane.showMessageDialog(null, "You are dead!!");

	}

	public static void main(String[] args) {

		new Start();
	}

}
