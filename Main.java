package src.main.design_patterns_java;

import src.main.design_patterns_java.abstract_factory.*;

public class Main {
    public static void main(String[] args) {
        Car truckScania = new Car(new ScaniaManufacturer());
        System.out.println("Scania truck:");
        truckScania.generateCar(BatteryTypes.LFP, BodysType.TRUCK);
        System.out.println("**********************************************");
        Car combiToyota = new Car(new ToyotaManufacturer());
        System.out.println("Toyota combi:");
        combiToyota.generateCar(BatteryTypes.NMC, BodysType.COMBI);
    }
}
