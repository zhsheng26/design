package command;

import java.util.HashMap;

public class Robot {
    private HashMap<CommandType, Command> commands = new HashMap<>();

    public void addCommand(CommandType commandType, Command command) {
        commands.put(commandType, command);
    }

    public void order(CommandType commandType) {
        if (!commands.containsKey(commandType)) {
            System.out.println("执行命令的设备没设置");
        } else {
            commands.get(commandType).execute();
        }
    }
}
