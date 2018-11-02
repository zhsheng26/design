package command;

import java.util.List;

/**
 * 批执行
 */
public class MacroCommand implements Command {
    private final List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
