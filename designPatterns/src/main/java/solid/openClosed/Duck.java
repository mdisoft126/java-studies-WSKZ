package solid.openClosed;

public class Duck extends Animal {

	public Duck(String animalName) {
		super(animalName);
	}

	void printAnimalSound() {
		System.out.println("Kwa!");
	}
}