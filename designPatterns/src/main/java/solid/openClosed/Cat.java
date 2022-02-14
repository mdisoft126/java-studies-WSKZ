package solid.openClosed;

public class Cat extends Animal {

	public Cat(String animalName) {
		super(animalName);
	}

	void printAnimalSound() {
		System.out.println("Meow!");
	}

}
