package patterns.creational.abstractFactory.example.iOS;

import patterns.creational.abstractFactory.example.AppFactory;
import patterns.creational.abstractFactory.example.Menu;
import patterns.creational.abstractFactory.example.Sound;

public class iOSApp implements AppFactory {

	@Override
	public Menu menu() {
		return new IOSMenu();
	}

	@Override
	public Sound sound() {
		return new IOSSound();
	}
	
}
