package factory_method;

public class MainFactory {

    public static void main(String[] args) {
        Coffee americano = CoffeeFactory.getCoffee("americano", 200, true);
        Coffee espresso = CoffeeFactory.getCoffee("espresso", 50, false);

        System.out.println("Factory Espresso Config::" + espresso);
        System.out.println("Factory Americano Config::" + americano);

        System.out.println(espresso instanceof Espresso);
        System.out.println(americano instanceof Americano);
    }
}