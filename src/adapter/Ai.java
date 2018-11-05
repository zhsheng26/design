package adapter;

public class Ai {

    public void voiceControlOpen(NewDeviceInterface deviceInterface) {
        deviceInterface.voicePlay();
    }

    public void voiceControlClose(NewDeviceInterface deviceInterface) {
        deviceInterface.voiceClose();
    }
}
