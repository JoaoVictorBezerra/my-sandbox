package design_patterns.factory.example_2;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza pizza1 = pizzaFactory.getPizza("MUSSARELA");
        pizza1.prepare();

        Pizza pizza2 = pizzaFactory.getPizza("CALABRESA");
        pizza2.prepare();

        Pizza pizza3 = pizzaFactory.getPizza("VEGGIE");
        pizza3.prepare();
    }
}
