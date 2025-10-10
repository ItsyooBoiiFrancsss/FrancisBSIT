package activity3;

public class Swordsman extends character {
	public Swordsman(String name) {
        super(name);
        this.health = 170;
    }

    public void slash() {
        manna -= 10;
    }

    public void showStats() {
        System.out.println("I am powerful!");
        super.showStats(); 
    }

}
