package solid.openClosed;

public class Main {

	public static void main(String[] args) {
		AnimalSoundPrinter animalSoundPrinter = new AnimalSoundPrinter();
		
		Animal garfield = new Cat("Garfield");
		
		animalSoundPrinter.printAnimalSound(garfield);
	}

}
