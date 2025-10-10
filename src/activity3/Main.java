package activity3;

public class Main {
	public static void main(String[] args) {
		
		 character character = new character("hero");
	        character.walk();
	        character.walk();
	        character.walk();
	        character.run();
	        character.run();
	        character.showStats();

	        System.out.println("\n_Shaman_");
	        Shaman shaman = new Shaman("Mystic");
	        shaman.walk();
	        shaman.walk();
	        shaman.walk();
	        shaman.run();
	        shaman.run();
	        shaman.heal();
	        shaman.showStats();

	        System.out.println("\n_swordsman_");
	        Swordsman swordsman = new Swordsman("Blade");
	        swordsman.walk();
	        swordsman.walk();
	        swordsman.walk();
	        swordsman.run();
	        swordsman.run();
	        swordsman.slash();
	        swordsman.slash();
	        swordsman.showStats();
	    }

}
