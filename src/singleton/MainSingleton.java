package singleton;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainSingleton {

    public static void main(String[] args) {

        Singleton logger1 = Singleton.getInstance();
        Singleton logger2 = Singleton.getInstance();

        List<Integer> testObject1 = new ArrayList<>(List.of(1, 2, 3));
        BigDecimal testObject2 = new BigDecimal(123);

        logger1.addObjectLog(testObject1);
        logger2.addObjectLog(testObject2);

        System.out.println("\nSingleton tests.");
        System.out.println("Is loggers are the same: " + logger1.equals(logger2));
        System.out.println(logger1.getLogInfo());
    }
}