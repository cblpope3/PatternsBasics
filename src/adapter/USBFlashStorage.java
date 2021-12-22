package adapter;

public class USBFlashStorage implements USBStorage {
    @Override
    public String getData() {
        return "Excel table.";
    }
}