package command;

public class MediaPlayCommand implements Command {
    private final MediaPlayer mediaPlayer;

    public MediaPlayCommand(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.insertCD();
        mediaPlayer.play();
    }
}
