package ru.otus.java.basic.homeworks.homework13;

public class HW13 {
    public static void main(String[] args) {
    Human human = new Human("Витя");
    Car car = new Car(50);
    Horse horse = new Horse(30);
    Bicycle bicycle = new Bicycle();
    AllTerrainVehicle atv = new AllTerrainVehicle(40);

        String[] terrains = {"равнина", "густой лес", "болото", "равнина"};
        int[] distances = {10, 5, 10, 15};

        Transport[] transports = {car, horse, bicycle, atv};

        for (Transport transport : transports) {
            human.sit(transport);
            for (int i = 0; i < terrains.length; i++) {
                if (!human.move(terrains[i], distances[i])) {
                    System.out.println("Перемещение невозможно. Попробуем другой транспорт.");
                    break;
                }
            }
            human.getOff();
        }
    }
}
