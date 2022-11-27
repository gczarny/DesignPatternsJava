package src.main.design_patterns_java.abstract_factory;

public abstract class Bodies {
    private final String height, weight, length;
    public Bodies(String height, String weight, String length) {
        this.height = height;
        this.weight = weight;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Body{" +
                "height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
