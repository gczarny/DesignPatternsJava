package src.main.design_patterns_java.builder.car;

import src.main.design_patterns_java.abstract_factory.BodysType;

public interface VehiclePlan {
    void setEngine(String engineType);
    void setBody(BodysType bodyType);
    void setSeats(String seats);
    void setFuelType(String fuelType);
    void setWheels(String wheels);
    void setTransmission(TransmissionTypes transmissionTypes);
}
