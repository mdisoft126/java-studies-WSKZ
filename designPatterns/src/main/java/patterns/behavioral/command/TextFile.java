package patterns.behavioral.command;

public class TextFile {
	
	private String fileName;
	
	private String text;

	public TextFile(String fileName, String text) {
		this.fileName = fileName;
		this.text = text;
	}
	
	public String undo() {
		return "Undo: " + fileName;
	}

	public String save() {
		return "Saving: " + fileName;
	}

}
