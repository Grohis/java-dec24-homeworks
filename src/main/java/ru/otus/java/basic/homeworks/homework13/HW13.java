package ru.otus.java.basic.homeworks.homework13;

public class HW13 {
    public static void main(String[] args) {
    Human human = new Human("Витя");
    Car car = new Car(50);
    Horse horse = new Horse(30);
    Bicycle bicycle = new Bicycle();
    AllTerrainVehicle atv = new AllTerrainVehicle(40);

        human.move("равнина", 5);
        human.sit(car);
        human.move("густой лес", 10);
        human.move("равнина", 20);
        human.getOff();
        human.sit(horse);
        human.move("болото", 10);
        human.move("равнина", 10);
        human.getOff();
    }
}
