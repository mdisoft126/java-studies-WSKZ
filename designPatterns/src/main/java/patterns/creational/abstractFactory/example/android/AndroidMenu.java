package patterns.creational.abstractFactory.example.android;

import patterns.creational.abstractFactory.example.Menu;

public class AndroidMenu implements Menu {

	@Override
	public void showMenu() {
		System.out.println("Showing Android menu");
	}

}
