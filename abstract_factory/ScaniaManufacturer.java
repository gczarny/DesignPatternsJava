package src.main.design_patterns_java.abstract_factory;

public class ScaniaManufacturer implements ElectricCarFactory {
    @Override
    public Batteries buildBattery(BatteryTypes type) {
        switch(type){
            case LFP:
                return new BatteryLFP("2500kWh",  15, 3);
            case LMO:
                return new BatteryLMO("3500kWh",  18, 5);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
    @Override
    public Bodies buildBody(BodysType body) {
        switch(body){
            case TRUCK:
                return new BodyTruck("2.8m", "2700kg", "5m");
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
}
