import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//maintenance class
public class VirtualPetShelter {

	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	// info of all current pets
	public Collection<VirtualPet> petValues() {
		return pets.values();

	}

	// tick for time
	public void tick(int amount) {

	}

	// admit a pet into shelter
	public void addPet(VirtualPet pet) {
		pets.put(pet.name, pet);
	}

	// specific virtual pet given its name
	public VirtualPet getName(String name) {
		return pets.get(name);
	}

	// remove account/adoption
	public VirtualPet removePet(String name) {
		return pets.remove(name);
	}

	// feed all the pets at once
	public void feedHunger() {
		for (VirtualPet current : pets.values()) {
			current.feedHunger(10);
		}
	}

	// water all the pets at once
	public void waterPets() {
		for (VirtualPet current : pets.values()) {
			current.waterPets(10);
		}
	}

	// play with one pet by name
	public void playSong(VirtualPet play) {
		play.playSong(10);
	}

	public void noThing() {
		for (VirtualPet current : pets.values()) {
			current.noThing(-5);
		}
	}

}
