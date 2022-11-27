package src.main.design_patterns_java.builder.car;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public VehicleBody getVehicleBody(){
        return builder.getVehicleBody();
    }

    public void constructVehicleBody(){
        builder.buildBody();
        builder.buildEngine();
        builder.buildFuelType();
        builder.buildTransmission();
        builder.buildSeats();
        builder.buildWheels();
    }
}
