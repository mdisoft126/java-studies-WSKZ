package patterns.creational.abstractFactory.example.iOS;

import patterns.creational.abstractFactory.example.Sound;

public class IOSSound implements Sound {

	@Override
	public void playSound() {
		System.out.println("Playing iOS sound");
	}
	

}
