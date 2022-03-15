package lect04_abstract_classes;

public class MySQLConnector extends DatabaseConnector {
	private static String jdbc = "MySQL";

	@Override
	public void connect(String dbName, String user, String password) {
		System.out.println("Connected!");
		System.out.printf("DB Engine: %s DB Name: %s User: %s Password: %s\n",
				jdbc, dbName, user, password);
		super.setDbName(dbName);
		super.setUser(user);
		super.setPassword(password);
	}

	@Override
	public void close() {
		System.out.println("Connection closed!");
	}
	
	public static void main(String[] args) {
		DatabaseConnector databaseConnector = new MySQLConnector();
		databaseConnector.connect("example_db", "example_user", "qwe123");
		System.out.println("BD Name: " + databaseConnector.getDbName());
		databaseConnector.close();
		System.out.println(databaseConnector.getClass());
	}

}
