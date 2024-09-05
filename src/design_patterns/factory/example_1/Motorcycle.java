package design_patterns.factory.example_1;

public class Motorcycle implements Vehicle{
    @Override
    public void move() {
        System.out.println("A Moto está acelerando!");
    }
}
