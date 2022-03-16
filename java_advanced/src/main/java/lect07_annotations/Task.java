package lect07_annotations;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Task {
	private String title;
	
	private LocalDateTime registrationTime = LocalDateTime.now();
	
	@DefaultValueAnnotation(title = "Hey")
	public void setTitle() throws NoSuchMethodException, SecurityException {
		DefaultValueAnnotation defaultValueAnnotation = this.getClass()
				.getMethod("setTitle")
				.getAnnotation(DefaultValueAnnotation.class);
		this.title = defaultValueAnnotation.title();
	}
	
	public static void main(String[] args) throws NoSuchMethodException {
		Task task = new Task();
		task.setTitle("Yo yo");
		System.out.println(task);
	}
}
