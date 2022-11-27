package src.main.design_patterns_java.abstract_factory;

public class ToyotaManufacturer implements ElectricCarFactory {
    @Override
    public Batteries buildBattery(BatteryTypes type) {
        switch(type){
            case NMC:
                return new BatteryLFP("3000kWh", 12, 8);
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
    @Override
    public Bodies buildBody(BodysType body) {
        switch(body){
            case TRUCK:
                return new BodyTruck("2.6m", "2200kg", "4.8m");
            case SEDAN:
                return new BodySedan("1.6m", "1400kg", "2.3m");
            case COMBI:
                return new BodyCombi("1.5m", "1600kg", "3.1m");
            default:
                throw new UnsupportedOperationException("Unknown type");
        }
    }
}
