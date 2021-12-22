import adapter.MainAdapter;
import factory_method.MainFactory;
import proxy.MainProxy;
import singleton.MainSingleton;

public class TestApp {
    public static void main(String[] args) {
        MainSingleton.main(null);
        MainFactory.main(null);
        MainAdapter.main(null);
        MainProxy.main(null);
    }
}
