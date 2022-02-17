package patterns.creational.abstractFactory.example;

import patterns.creational.abstractFactory.example.android.AndroidApp;
import patterns.creational.abstractFactory.example.iOS.iOSApp;

public class Main {

	public static void main(String[] args) {

		iOSApp iosApp = new iOSApp();
		iosApp.showMenu();
		iosApp.playSound();
		
		AndroidApp androidApp = new AndroidApp();
		androidApp.showMenu();
		androidApp.playSound();
		
	}

}
