package factory_method;

public class CoffeeFactory {

    public static Coffee getCoffee(String type, int volume, boolean sugar){
        if("Espresso".equalsIgnoreCase(type)) return new Espresso(volume, sugar);
        else if("Americano".equalsIgnoreCase(type)) return new Americano(volume, sugar);
        else return null;
    }
}