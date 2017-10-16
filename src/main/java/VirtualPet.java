
//model class
public class VirtualPet {

	String name;
	String description;

	int hungerLevel;
	int thirstLevel;
	int boredLevel;
	int amount = 10;

	// constructor that accepts name and description- admit a pet
	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public VirtualPet(String name, String description, int hungerLevel, int thirstLevel, int boredLevel) {
		this.name = name;
		this.description = description;
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.boredLevel = boredLevel;
	}

	public VirtualPet(int hungerLevel, int thirstLevel, int boredLevel) {
		this.hungerLevel = hungerLevel;
		this.thirstLevel = thirstLevel;
		this.boredLevel = boredLevel;
	}

	// tick method
	public void tick() {
		hungerLevel -= amount / 5;
		thirstLevel -= amount / 5;
		boredLevel -= amount / 5;
	}

	// feed method all
	public void feedHunger(int amount) {
		hungerLevel += amount;
		thirstLevel -= amount;
	}

	// water method all
	public void waterPets(int amount) {
		thirstLevel += amount;
		boredLevel -= amount;
	}

	// play method single
	public void playSong(int amount) {
		boredLevel += amount;
	}

	// do nothing method
	public void noThing(int amount) {
		thirstLevel -= amount;
	}

	// }
	//
	public String getName() {
		return name;
	}

}
