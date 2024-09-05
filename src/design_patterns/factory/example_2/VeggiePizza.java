package design_patterns.factory.example_2;

public class VeggiePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Pizza Vegana");
    }
}
