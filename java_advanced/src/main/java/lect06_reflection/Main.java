package lect06_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
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
		//OPERATIONS ON THE FIELDS OF THE CLASS
		Field titleField = task.getDeclaredField("title");
		titleField.set(taskFromReflection, "Reflection learining");
		System.out.println(titleField.get(taskFromReflection));
		// METHOD OPERATIONS
		Method setRegistrationTime = task.getMethod("setRegistrationTime", LocalDateTime.class);
		setRegistrationTime.invoke(taskFromReflection, LocalDateTime.now());
		Method toStringMethod = task.getMethod("toString");
		System.out.println(toStringMethod.invoke(taskFromReflection));
	}

}
