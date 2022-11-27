package src.main.design_patterns_java.builder;

import src.main.design_patterns_java.builder.car.Builder;
import src.main.design_patterns_java.builder.car.Director;
import src.main.design_patterns_java.builder.car.MazdaRX8Body;
import src.main.design_patterns_java.builder.car.PorschePanameraBody;

public class Main {
    public static void main(String[] args) {
        Builder mazda = new MazdaRX8Body();
        Builder panamera = new PorschePanameraBody();
        Director director;

        director = new Director(mazda);
        director.constructVehicleBody();
        System.out.println(director.getVehicleBody());
        System.out.println("****************************");
        director = new Director(panamera);
        director.constructVehicleBody();
        System.out.println(director.getVehicleBody());
    }
}
