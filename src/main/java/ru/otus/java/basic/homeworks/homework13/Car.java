package ru.otus.java.basic.homeworks.homework13;

class Car extends Transport {
    public Car(int fuel) {
        super("Машина", fuel);
    }

    @Override
    public boolean canMove(String terrain) {
        return !terrain.equals("густой лес") && !terrain.equals("болото");
    }

    @Override
    public boolean move(int distanse, String terrain) {
        if (!canMove(terrain) || fuelOrEnergy < distanse) {
            System.out.println(name + " не может двигаться дальше по " + terrain);
            return false;
        }
        fuelOrEnergy -= distanse;
        System.out.println(name + " проехала " + distanse + " км по " + terrain);
        return true;
    }
}
