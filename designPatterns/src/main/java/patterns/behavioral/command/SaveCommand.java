package patterns.behavioral.command;

public class SaveCommand implements Command {

	private TextFile textFile;
	
	public SaveCommand(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.save();
	}
	
	
}
