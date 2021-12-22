package adapter;

public class Computer {

    public void usbConnect(USBStorage usbStorage) {
        System.out.println("Got data: " + usbStorage.getData());
    }
}