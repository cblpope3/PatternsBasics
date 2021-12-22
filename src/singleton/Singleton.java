package singleton;

import java.util.ArrayList;
import java.util.List;

public class Singleton {

    private static Singleton instance;

    private final List<Class> logInfo = new ArrayList<>();

    private Singleton() {
    }

    public void addObjectLog(Object object) {
        logInfo.add(object.getClass());
    }

    public String getLogInfo() {
        StringBuilder loggedInfo = new StringBuilder("log info: ");
        for (int i = 0; i < logInfo.size(); i++) {
            loggedInfo.append(logInfo.get(i).getSimpleName());
            if (i < logInfo.size() - 1) loggedInfo.append(", ");
        }
        return loggedInfo.toString();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}