package factory_method;

public abstract class Coffee {

    public abstract int getVolume();

    public abstract boolean getSugar();

    @Override
    public String toString() {
        return "Volume = " + this.getVolume() + ", Sugar = " + this.getSugar();
    }
}