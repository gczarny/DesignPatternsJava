package src.main.design_patterns_java.abstract_factory;

public class BatteryNMC extends Batteries{
    protected BatteryNMC(String capacity, int numberOfCells, int numberOfModules) {
        super(capacity, numberOfCells, numberOfModules);
    }
}
