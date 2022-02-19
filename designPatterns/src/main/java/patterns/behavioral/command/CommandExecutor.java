package patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class CommandExecutor {
	
	List<Command> commands = new ArrayList<>();
	
	public String executeCommand(Command command) {
		commands.add(command);
		return command.execute();
	}
}
