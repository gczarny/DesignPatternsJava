package src.main.design_patterns_java.abstract_factory;

// klasa klienta (kontekst wykonania fabryki)
public class Car {
    private final ElectricCarFactory electricCarFactory;
    public Car(ElectricCarFactory electricCarFactory) {
        this.electricCarFactory = electricCarFactory;
    }
    public void generateCar(BatteryTypes batteryType, BodysType bodyType){
        Batteries battery = electricCarFactory.buildBattery(batteryType);
        Bodies body = electricCarFactory.buildBody(bodyType);
        System.out.println(battery + "\n" + body);
    }
}
