package patterns.creational.singleton;

public class Main {

	public static void main(String[] args) {
		DatabaseConnection connection = DatabaseConnection.getInstance("http://localhost:8080/db");
		System.out.println(connection.getConnectionUrl());
		
		//the instance exist so we don't get null value. We will get the value from first instance
		
		DatabaseConnection connection2 = DatabaseConnection.getInstance("null");
		System.out.println(connection2.getConnectionUrl());
		
	}

}
