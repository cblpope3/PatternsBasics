package singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}






















//            if(Thread.currentThread().getName().equals("123"))
//                    try {
//                    Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                    e.printStackTrace();
//                    }
