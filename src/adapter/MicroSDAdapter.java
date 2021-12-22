package adapter;

public class MicroSDAdapter implements USBStorage {
    protected MicroSDCard microSDCard;

    public MicroSDAdapter(MicroSDCard microSDCard) {
        this.microSDCard = microSDCard;
    }

    public String getData() {
        return microSDCard.downloadData();
    }
}