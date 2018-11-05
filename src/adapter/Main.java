package adapter;

public class Main {
    public static void main(String[] args) {
        OldPlayer oldPlayer = new OldPlayer();
        Ai ai = new Ai();
        DeviceAdapter adapter = new DeviceAdapter(oldPlayer);
        ai.voiceControlOpen(adapter);
        ai.voiceControlClose(adapter);
    }


}
