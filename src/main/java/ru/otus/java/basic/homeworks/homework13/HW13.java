package ru.otus.java.basic.homeworks.homework13;

public class HW13 {
    public static void main(String[] args) {
        Human john = new Human("Джон");
        Car car = new Car(20);
        Horse horse = new Horse(15);
        Bicycle bike = new Bicycle();
        AllTerrainVehicle atv = new AllTerrainVehicle(25);

        Terrain[] terrains = {Terrain.PLAIN, Terrain.DENSE_FOREST, Terrain.SWAMP, Terrain.PLAIN};
        int[] distances = {10, 5, 10, 15};

        Transport[] transports = {car, horse, bike, atv};

        for (Transport transport : transports) {
            john.sit(transport);
            for (int i = 0; i < terrains.length; i++) {
                if (!john.move(terrains[i], distances[i])) {
                    System.out.println("Перемещение невозможно. Попробуем другой транспорт.");
                    break;
                }
            }
            john.getOff();
        }
    }
}
