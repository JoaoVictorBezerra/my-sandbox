package design_patterns.factory.example_1;

public class Truck implements Vehicle{
    @Override
    public void move() {
        System.out.println("O Caminhão está dirigindo!");
    }
}
