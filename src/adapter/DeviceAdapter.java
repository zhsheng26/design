package adapter;

public class DeviceAdapter implements NewDeviceInterface {
    private final OldDeviceInterface oldDevice;

    public DeviceAdapter(OldDeviceInterface oldDevice) {
        this.oldDevice = oldDevice;
    }

    @Override
    public void voicePlay() {
        oldDevice.open();
        oldDevice.play();
    }

    @Override
    public void voiceClose() {
        oldDevice.close();
    }
}
