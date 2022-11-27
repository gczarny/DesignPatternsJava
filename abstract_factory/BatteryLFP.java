package src.main.design_patterns_java.abstract_factory;

public class BatteryLFP extends Batteries{
    protected BatteryLFP(String capacity, int numberOfCells, int numberOfModules) {
        super(capacity, numberOfCells, numberOfModules);
    }
}
