package src.main.design_patterns_java.builder.car;

public interface Builder {
    void buildEngine();
    void buildBody();
    void buildSeats();
    void buildFuelType();
    void buildWheels();
    void buildTransmission();
    VehicleBody getVehicleBody();
}
