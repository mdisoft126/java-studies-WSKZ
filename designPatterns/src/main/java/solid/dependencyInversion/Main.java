package solid.dependencyInversion;

public class Main {

	public static void main(String[] args) {
		Guitar guitar = new Guitar("bass guitar");
		Piano piano = new Piano();
		Musician musician = new Musician(piano);
	}

}
