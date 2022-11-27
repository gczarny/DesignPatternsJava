package src.main.design_patterns_java.abstract_factory;

public class BatteryLMO extends Batteries{
    protected BatteryLMO(String capacity, int numberOfCells, int numberOfModules) {
        super(capacity, numberOfCells, numberOfModules);
    }
}
