package solid.singleResponsibility;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TextFileMaker {
	
	public void createTextFile(String name, String text) throws IOException {
		try (FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/" + name)) {
			fileOutputStream.write(text.getBytes(StandardCharsets.UTF_8));
		}
	}

}
