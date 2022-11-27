package src.main.design_patterns_java.builder.car;

import src.main.design_patterns_java.abstract_factory.BodysType;

public class VehicleBody implements VehiclePlan{
    private String engineType, seats, fuelType, wheels;
    private TransmissionTypes transmissionType;
    private BodysType bodyType;
    //@Override
    public void setEngine(String engineType) {
        this.engineType = engineType;
    }
    public void setBody(BodysType bodyType) {
        this.bodyType = bodyType;
    }
    public void setSeats(String seats) {
        this.seats = seats;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }
    public void setTransmission(TransmissionTypes transmissionType) {
        this.transmissionType = transmissionType;
    }
    public String toString() {
        return "Vehicle Body{" +
                "engineType = '" + engineType + '\'' +
                ", seats = '" + seats + '\'' +
                ", fuelType = '" + fuelType + '\'' + ",\n" +
                "wheels = '" + wheels + '\'' +
                ", transmissionType = " + transmissionType +
                ", bodyType = " + bodyType +
                '}';
    }
}