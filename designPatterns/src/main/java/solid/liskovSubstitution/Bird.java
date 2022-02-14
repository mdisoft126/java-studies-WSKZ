package solid.liskovSubstitution;

public class Bird extends Animal {

	@Override
	void walk() {System.out.println("Bird is walking");}

	@Override
	void fly() {System.out.println("Bird is flying");}
	
	

}
