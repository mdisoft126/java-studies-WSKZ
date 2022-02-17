package patterns.creational.abstractFactory.example.android;

import patterns.creational.abstractFactory.example.AppFactory;
import patterns.creational.abstractFactory.example.Menu;
import patterns.creational.abstractFactory.example.Sound;

public class AndroidApp implements AppFactory {

	@Override
	public Menu menu() {
		return new AndroidMenu();
	}

	@Override
	public Sound sound() {
		return new AndroidSound();
	}	
}