package design_patterns.strategy.exercise_1;

public class FedexFreight implements FreightStrategy {
    @Override
    public double calculateFreight(double weight, double value) {
        return 60;
    }
}
