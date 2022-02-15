package patterns.creational.singleton;

public class DatabaseConnection {
	
	private static DatabaseConnection instance;
	private String connectionUrl;
	
	private DatabaseConnection(String connectionUrl) {this.connectionUrl = connectionUrl;}
	
	public String getConnectionUrl() {
		return connectionUrl;
	}
	
	public static DatabaseConnection getInstance(String connectionUrl) {
		if (instance == null) {
			instance = new DatabaseConnection(connectionUrl);
		}
		return instance;
	}

}
