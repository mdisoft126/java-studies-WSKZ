package patterns.behavioral.command;

public class Main {

	public static void main(String[] args) {
		TextFile textFile = new TextFile("note", "some text");
		CommandExecutor commandExecutor = new CommandExecutor();
		System.out.println(commandExecutor.executeCommand(new SaveCommand(textFile)));
		System.out.println(commandExecutor.executeCommand(new UndoCommand(textFile)));
		
		System.out.println(commandExecutor.commands.get(0));
		System.out.println(commandExecutor.commands.get(1));
		
	}

}
