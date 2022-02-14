package solid.openClosed;

public abstract class Animal {

	String animalName;
	
	public Animal(String animalName) {this.animalName = animalName;}
	
	abstract void printAnimalSound();
}
