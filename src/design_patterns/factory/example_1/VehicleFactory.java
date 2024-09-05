package design_patterns.factory.example_1;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equalsIgnoreCase("MOTO")) {
            return new Motorcycle();
        }
        if(vehicleType.equalsIgnoreCase("CARRO")) {
            return new Car();
        }
        if(vehicleType.equalsIgnoreCase("CAMINHAO")) {
            return new Truck();
        }
        return null;
    }
}
