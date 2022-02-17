package patterns.creational.abstractFactory.example.iOS;

import patterns.creational.abstractFactory.example.Menu;
import patterns.creational.abstractFactory.example.Sound;

public class iOSApp implements Sound, Menu {

	@Override
	public void showMenu() {
		System.out.println("Showing iOS menu");
	}

	@Override
	public void playSound() {
		System.out.println("Playing iOS sound");
	}
	
}
