package adapter;

public class USBHddStorage implements USBStorage {
    @Override
    public String getData() {
        return "FullHD movie";
    }
}