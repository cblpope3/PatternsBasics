package proxy;

public class MainProxy {

    public static void main(String[] args) {
        Door door = new Door();
        Security security = new Security(door);

        security.open("1234");
        security.open("123234");
    }
}
