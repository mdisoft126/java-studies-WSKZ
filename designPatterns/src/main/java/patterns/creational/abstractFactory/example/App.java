package patterns.creational.abstractFactory.example;

public class App {
	
	private Menu menu;
	
	private Sound sound;
	
	public App(AppFactory appFactory) {
		this.menu = appFactory.menu();
		this.sound = appFactory.sound();
	}
	
	public void run() {
		menu.showMenu();
		sound.playSound();
	}

}
