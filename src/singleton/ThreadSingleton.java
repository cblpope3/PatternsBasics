package singleton;

public class ThreadSingleton implements Runnable {

    private Singleton singleton;

    @Override
    public void run() {
        singleton = Singleton.getInstance();
    }

    public Singleton getSingleton() {
        return singleton;
    }
}
