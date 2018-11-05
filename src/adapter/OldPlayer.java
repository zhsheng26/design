package adapter;

public class OldPlayer implements OldDeviceInterface {
    @Override
    public void open() {
        System.out.println("打开");
    }

    @Override
    public void play() {
        System.out.println("播放");
    }

    @Override
    public void close() {
        System.out.println("关闭");
    }
}
