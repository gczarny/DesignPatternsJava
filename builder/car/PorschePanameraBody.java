package src.main.design_patterns_java.builder.car;
import src.main.design_patterns_java.abstract_factory.BodysType;

public class PorschePanameraBody implements Builder{
    private VehicleBody vehicleBody;
    public PorschePanameraBody() {
        this.vehicleBody = new VehicleBody();
    }
    @Override
    public void buildEngine() {
        vehicleBody.setEngine("4.0L Twin-turbocharged V8 / E-Machine");
    }
    @Override
    public void buildBody() {
        vehicleBody.setBody(BodysType.COMBI);
    }
    @Override
    public void buildSeats() {
        vehicleBody.setSeats("5 seats");
    }
    @Override
    public void buildFuelType() {
        vehicleBody.setFuelType("Hybrid");
    }
    @Override
    public void buildWheels() {
        vehicleBody.setWheels("Diamond-Cut Wheels");
    }
    @Override
    public void buildTransmission() {
        vehicleBody.setTransmission(TransmissionTypes.CVT);
    }
    @Override
    public VehicleBody getVehicleBody() {
        return vehicleBody;
    }
}
