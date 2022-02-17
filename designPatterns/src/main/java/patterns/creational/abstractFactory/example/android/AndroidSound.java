package patterns.creational.abstractFactory.example.android;

import patterns.creational.abstractFactory.example.Sound;

public class AndroidSound implements Sound {

	@Override
	public void playSound() {
		System.out.println("Playing Android sound");
	}

}
