package design_patterns.factory.example_1;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("O carro está dirigindo!");
    }
}
