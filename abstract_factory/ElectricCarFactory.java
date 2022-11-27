package src.main.design_patterns_java.abstract_factory;

public interface ElectricCarFactory {
    Batteries buildBattery(BatteryTypes type);
    Bodies buildBody(BodysType body);
}
