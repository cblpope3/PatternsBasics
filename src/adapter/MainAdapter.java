package adapter;

public class MainAdapter {

    public static void main(String[] args) {

        System.out.println("\nAdapter tests:");
        USBStorage hdd = new USBHddStorage();
        USBStorage flash = new USBFlashStorage();

        Computer computer = new Computer();
        computer.usbConnect(hdd);
        computer.usbConnect(flash);

        MicroSDCard microSD = new MicroSDCard();
        MicroSDAdapter microSDAdapter = new MicroSDAdapter(microSD);
        computer.usbConnect(microSDAdapter);
    }
}