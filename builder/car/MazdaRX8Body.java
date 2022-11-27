package src.main.design_patterns_java.builder.car;

import src.main.design_patterns_java.abstract_factory.BodysType;

public class MazdaRX8Body implements Builder{
    private VehicleBody vehicleBody;
    public MazdaRX8Body() {
        this.vehicleBody = new VehicleBody();
    }
    @Override
    public void buildEngine() {
        vehicleBody.setEngine("1.3 L RENESIS (Wankel rotary)");
    }
    @Override
    public void buildBody() {
        vehicleBody.setBody(BodysType.HATCHBACK);
    }
    @Override
    public void buildSeats() {
        vehicleBody.setSeats("Luxury with armrest");
    }
    @Override
    public void buildFuelType() {
        vehicleBody.setFuelType("Diesel");
    }
    @Override
    public void buildWheels() {
        vehicleBody.setWheels("Chrome Wheels");
    }
    @Override
    public void buildTransmission() {
        vehicleBody.setTransmission(TransmissionTypes.AUTOMATIC);
    }
    @Override
    public VehicleBody getVehicleBody() {
        return vehicleBody;
    }
}
