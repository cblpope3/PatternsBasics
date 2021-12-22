package adapter;

public class MainAdapter {

    public static void main(String[] args) {

        Lion lionAsian = new AsianLion();
        Lion lionAfrican = new AfricanLion();

        Hunter hunter = new Hunter();
        hunter.hunt(lionAsian);
        hunter.hunt(lionAfrican);

        WildDog wildDog = new WildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(wildDog);
        hunter.hunt(wildDogAdapter);



    }
}
