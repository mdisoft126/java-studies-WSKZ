package patterns.creational.abstractFactory.example.android;

import patterns.creational.abstractFactory.example.Menu;
import patterns.creational.abstractFactory.example.Sound;

public class AndroidApp implements Sound, Menu {

	@Override
	public void showMenu() {
		System.out.println("Showing Android menu");
	}

	@Override
	public void playSound() {
		System.out.println("Playing Android sound");
	}
	
}