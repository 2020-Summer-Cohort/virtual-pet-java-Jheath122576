package virtual.pet;

public class VirtualPet {

	String name;

	// set up the variables I wanted to utilize

	private int hunger;
	private int thirst;
	private int fatigue;
	private int boredom;

	// built the constructor for the project

	public VirtualPet(int hunger, int thirst, int fatigue, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.fatigue = fatigue;
		this.boredom = boredom;
	}

	// getters

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getFatigue() {
		return fatigue;
	}

	public int getBoredom() {
		return boredom;
	}



	public void tick() {
		this.hunger += 5;
		this.thirst += 5;
		this.fatigue += 3;
		this.boredom += 6;
	}

	// made this different values, I feel like once they sleep there good for a lot
	// longer, then say after eatting

	public void feedLettuce() {
		this.hunger -= 20;
	}

	public void giveWater() {
		this.thirst -= 20;
	}

	public void play() {
		this.boredom -= 30;
	}

	public void sleep() {
		this.fatigue -= 35;
	}

}
