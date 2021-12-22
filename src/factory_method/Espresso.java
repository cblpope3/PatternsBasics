package factory_method;

public class Espresso extends Coffee {

    private final int volume;
    private final boolean sugar;

    public Espresso(int volume, boolean sugar) {
        this.volume = volume;
        this.sugar = sugar;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public boolean getSugar() {
        return this.sugar;
    }
}