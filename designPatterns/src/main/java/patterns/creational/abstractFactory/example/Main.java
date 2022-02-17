package patterns.creational.abstractFactory.example;

import patterns.creational.abstractFactory.example.android.AndroidApp;
import patterns.creational.abstractFactory.example.iOS.iOSApp;


public class Main {

	public static void main(String[] args) {

		App iosApp = new App(new iOSApp());
		iosApp.run();
		
		App androidApp = new App(new AndroidApp());
		androidApp.run();
	}

}
