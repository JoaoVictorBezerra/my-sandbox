package design_patterns.factory.example_2;

public class PizzaFactory {
    public Pizza getPizza(String tasty) {
        return switch (tasty) {
            case "CALABRESA":
                yield new CalabresaPizza();
            case "MUSSARELA":
                yield new MussarelaPizza();
            case "VEGGIE":
                yield new VeggiePizza();
            default:
                yield null;
        };
    }
}
