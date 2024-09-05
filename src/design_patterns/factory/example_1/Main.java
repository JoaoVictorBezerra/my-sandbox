package design_patterns.factory.example_1;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle motorcycle = vehicleFactory.getVehicle("MOTO");
        motorcycle.move();
        Vehicle car = vehicleFactory.getVehicle("CARRO");
        car.move();
        Vehicle truck = vehicleFactory.getVehicle("CAMINHAO");
        truck.move();
    }
}
