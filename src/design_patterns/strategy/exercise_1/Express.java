package design_patterns.strategy.exercise_1;

public class Express implements FreightStrategy {

    @Override
    public double calculateFreight(double weight, double value) {
        if (weight <= 20 && value <= 50) return 20;
        if (weight <= 50 && value <= 80) return 40;
        return 60;
    }
}
