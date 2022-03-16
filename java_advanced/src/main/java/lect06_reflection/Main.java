package lect06_reflection;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class task = Class.forName("lect06_reflection.Task");
		// FIELDS
		// getFields() - recognize access specifiers
		Arrays.stream(task.getFields()).forEach(System.out::println);
		Arrays.stream(task.getDeclaredFields()).forEach(System.out::println);
		// METHODS
		Arrays.stream(task.getMethods()).forEach(System.out::println);
		// CONSTRUCTORS
		Arrays.stream(task.getConstructors()).forEach(System.out::println);
		// INSTANCING
		Task taskFromReflection = (Task) task.newInstance();

	}

}
