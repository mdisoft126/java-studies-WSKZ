package patterns.behavioral.command;

public class UndoCommand implements Command {

	private TextFile textFile;
	
	public UndoCommand(TextFile textFile) {
		this.textFile = textFile;
	}

	@Override
	public String execute() {
		return textFile.undo();
	}

}
