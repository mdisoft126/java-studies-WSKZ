package lect04_abstract_classes;

import lombok.Data;

@Data
public abstract class DatabaseConnector {
	
	private String dbName;
	private String user;
	private String password;
	
	public abstract void connect(String dbName, String user, String password);
	public abstract void close();
	
}
