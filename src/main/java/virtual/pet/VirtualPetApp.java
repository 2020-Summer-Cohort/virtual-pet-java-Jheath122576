package virtual.pet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String mykitten = "Jeffroe";


		VirtualPet myPet = new VirtualPet(40, 40, 40, 40);

		System.out.println("Hello, this is " + mykitten + " the fat kitten!");

		String option;
		do {
			System.out.println(mykitten + " 's hunger level is " + myPet.getHunger());
			System.out.println(mykitten + " 's thirst level is " + myPet.getThirst());
			System.out.println(mykitten + " 's boredom level is " + myPet.getBoredom());
			System.out.println(mykitten + " 's tiredness level is " + myPet.getFatigue());
			System.out.println("What would you like to do?");
			System.out.println("1. Give " + mykitten + " some moist tuna.");
			System.out.println("2. Pour " + mykitten + " some milk.");
			System.out.println("3. Play with " + mykitten + " yarn ball.");
			System.out.println("4. Put " + mykitten + " to sleep.");
			System.out.println("5. Just lazy.");
			System.out.println("6. Gives up");


			option = input.next();

			if (option.equals("1")) {
				System.out.println("You give " + mykitten + " moist tuna, she purrrrsss.");
				myPet.feedLettuce();
			}

			if (option.equals("2")) {
				System.out.println("You pour " + mykitten + " some milk.");
				myPet.giveWater();
			}

			if (option.equals("3")) {
				System.out.println("You take " + mykitten+ " out to play, he just sits there!");
				myPet.play();
			}

			if (option.equals("4")) {
				System.out.println("You take " + mykitten + " to sleep.");
				myPet.sleep();
			}

			if (option.equals("5")) {
				System.out.println(mykitten + " does nothing");
			}

			myPet.tick();

		} while (!option.equals("6"));
		System.out.println("Thanks for playing!");
		System.exit(0);

		input.close();

	}

}
