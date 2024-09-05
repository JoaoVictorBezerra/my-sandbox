package design_patterns.factory.example_2;

public class MussarelaPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("Pizza de Mussarela");
    }
}
