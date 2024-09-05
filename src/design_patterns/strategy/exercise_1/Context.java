package design_patterns.strategy.exercise_1;

public class Context {
    private FreightStrategy freightStrategy;

    public void setFreightStrategy(FreightStrategy freightStrategy) {
        this.freightStrategy = freightStrategy;
    }

    public double calculateFreight(double weight, double value) {
        return this.freightStrategy.calculateFreight(weight, value);
    }
}
