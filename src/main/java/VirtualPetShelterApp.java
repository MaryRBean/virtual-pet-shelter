import java.util.Scanner;

//user interface and main method
public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter shelter = new VirtualPetShelter();

		System.out.println("Welcome to Mary's Pet Shelter! Thank you for volunteering!\n");

		VirtualPet sparkle = new VirtualPet("Sparkle", "Unicorn", 20, 30, 30);
		VirtualPet kim = new VirtualPet("Kim", "Cougar", 20, 30, 30);
		VirtualPet beyonce = new VirtualPet("Beyonce", "Poodle", 20, 30, 30);
		VirtualPet rihanna = new VirtualPet("Rihanna", "Cat", 20, 30, 30);

		shelter.addPet(sparkle);
		shelter.addPet(kim);
		shelter.addPet(beyonce);
		shelter.addPet(rihanna);

		System.out.println("This is the status of your pets:\n");
		System.out.println("Name\t|Type\t|Hunger\t|Thirst\t|Boredom");
		System.out.println("----------------------------------------");

		for (VirtualPet current : shelter.petValues()) {
			System.out.println("" + current.name + "\t" + current.description + "\t" + current.hungerLevel + "\t"
					+ current.thirstLevel + "\t" + current.boredLevel + "");
		}

		while (!shelter.pets.isEmpty()) {

			String displayMenu;

			System.out.println("\nWhat would you like to do with the animals today?");
			System.out.println("\nChoose an option.\n");
			System.out.println("1. Feed the animals cupcakes");
			System.out.println("2. Let the animals drink");
			System.out.println("3. Play songs for animals to dance to when bored");
			System.out.println("4. Adopt an animal");
			System.out.println("5. Admit an animal into the shelter");
			System.out.println("6. Do nothing\n");

			String choice = input.next();

			if (choice.equals("1")) {
				System.out.println("You fed all the animals cupcakes!\n");
				shelter.feedHunger();

			} else if (choice.equals("2")) {
				shelter.waterPets();
				System.out.println("You gave all the pets water!\n");

			} else if (choice.equals("3")) {
				System.out.println("Which pet would you like to play with? Please enter their name.");

				for (VirtualPet pet : shelter.petValues()) {
				}
				String petPlay = input.next().toLowerCase();
				VirtualPet playSong = shelter.getName(petPlay);

				System.out.println("You played a Beyonce song for " + petPlay + " to dance to.\n");

			} else if (choice.equals("4")) {// adopt

				System.out.println("Which pet did you want to adopt? Please enter their name.");

				for (VirtualPet pet : shelter.petValues()) {
				}
				String adoptPet = input.next().toLowerCase();
				VirtualPet removePet = shelter.removePet(adoptPet);

				System.out.println("You have successfully adopted " + adoptPet + "!");

			} else if (choice.equals("5")) {// admit
				System.out.println("What is the name of the pet you would like to admit into the shelter?");
				String newPet = input.next().toLowerCase();
				System.out.println("What type of animal is it?");
				String newPetType = input.next().toLowerCase();
				VirtualPet addPet = new VirtualPet(newPet, newPetType);
				shelter.addPet(addPet);
				System.out.println("" + newPet + " is now admitted into the shelter!");

			} else {
				shelter.noThing();
				System.out.println("You did absolutely nothing. You are no help at all.\n");

				break;

			}

			System.out.println("This is the status of your pets:\n");
			System.out.println("Name\t|Type\t|Hunger\t|Thirst\t|Boredom");
			System.out.println("----------------------------------------");

			for (VirtualPet current : shelter.petValues()) {
				System.out.println("" + current.name + "\t" + current.description + "\t" + current.hungerLevel + "\t"
						+ current.thirstLevel + "\t" + current.boredLevel + "");
			}

			int amount = -3;
			shelter.tick(amount);

			if (shelter.pets.isEmpty()) {
				System.out.println("Your job is done.");
				System.exit(0);

			}

		}

	}

	public void byeBye(int hungerLevel, int thirstLevel, int boredLevel) {
		if (hungerLevel <= 0 || thirstLevel <= 0 || boredLevel <= 0) {
			System.out.println("You have killed animals. You are not right for the job.");
			System.exit(0);

		}
	}
}
