package solid.singleResponsibility;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Note note = new Note("name", "some text");
		
		TextFileMaker textFileMaker = new TextFileMaker();
		textFileMaker.createTextFile(note.getName(), note.getText());
	}
}
