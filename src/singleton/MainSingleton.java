package singleton;

public class MainSingleton {

    public static void main(String[] args) {

//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//
//        System.out.println(singleton1.equals(singleton2));


        ThreadSingleton threadSingleton = new ThreadSingleton();

        Thread thread = new Thread(threadSingleton);

        thread.start();
        Singleton singleton1 = Singleton.getInstance();

        while (thread.isAlive()) {

        }

        System.out.println(singleton1.equals(threadSingleton.getSingleton()));

    }



}




















