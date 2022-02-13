package solid.singleResponsibility;

public class Note {
	
	private String name;
	private String text;
	
	public Note(String name, String text) {
		this.name = name;
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public String getName() {
		return name;
	}
	
}
