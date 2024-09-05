package design_patterns.strategy.exercise_1;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setFreightStrategy(new Economy());
        System.out.println("Valor do frete: " + context.calculateFreight(10, 20));

        context.setFreightStrategy(new Express());
        System.out.println("Valor do frete: " + context.calculateFreight(10, 20));

        context.setFreightStrategy(new FedexFreight());
        System.out.println("Valor do frete: " + context.calculateFreight(10, 20));
    }
}
