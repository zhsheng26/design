package command;

public class MediaCloseCommand implements Command {
    private final MediaPlayer mediaPlayer;

    public MediaCloseCommand(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void execute() {
        mediaPlayer.stop();
        mediaPlayer.close();
    }
}
