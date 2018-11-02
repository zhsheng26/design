package command;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //设备
        Robot robot = new Robot();
        Light light = new Light();
        //命令
        robot.addCommand(CommandType.LIGHT_ON, new LightOnCommand(light));
        robot.addCommand(CommandType.LIGHT_OFF, new LightOffCommand(light));
        MediaPlayer mediaPlayer = new MediaPlayer();
        robot.addCommand(CommandType.MEDIA_PLAY, new MediaPlayCommand(mediaPlayer));
        robot.addCommand(CommandType.MEDIA_CLOSE, new MediaCloseCommand(mediaPlayer));
        //执行
        robot.order(CommandType.LIGHT_ON);
        robot.order(CommandType.MEDIA_PLAY);
        robot.order(CommandType.MEDIA_CLOSE);
        robot.order(CommandType.LIGHT_OFF);

        ArrayList<Command> commands = new ArrayList<>();
        commands.add(new LightOnCommand(light));
        commands.add(new MediaPlayCommand(mediaPlayer));
        commands.add(new MediaCloseCommand(mediaPlayer));
        commands.add(new LightOffCommand(light));
        MacroCommand macroCommand = new MacroCommand(commands);
        robot.addCommand(CommandType.All, macroCommand);
        robot.order(CommandType.All);
    }
}
