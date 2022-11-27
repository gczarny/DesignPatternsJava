package src.main.design_patterns_java.abstract_factory;

public abstract class Batteries {
    private final String capacity;
    private final int numberOfCells, numberOfModules;
    protected Batteries(String capacity, int numberOfCells, int numberOfModules) {
        this.capacity = capacity;
        this.numberOfCells = numberOfCells;
        this.numberOfModules = numberOfModules;
    }
    @Override
    public String toString() {
        return "Battery{" +
                "capacity='" + capacity + '\'' +
                ", numberOfCells=" + numberOfCells +
                ", numberOfModules=" + numberOfModules +
                '}';
    }
}
