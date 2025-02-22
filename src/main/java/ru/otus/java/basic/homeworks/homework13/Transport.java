package ru.otus.java.basic.homeworks.homework13;


abstract class Transport {
    protected String name;
    protected int fuelOrEnergy;

    public Transport(String name, int fuelOrEnergy) {
        this.name = name;
        this.fuelOrEnergy = fuelOrEnergy;
    }

    public abstract boolean canMove(Terrain terrain);

    public boolean move(int distance, Terrain terrain) {
        if (!canMove(terrain) || fuelOrEnergy < distance) {
            System.out.println(name + " не может двигаться по " + terrain);
            return false;
        }
        fuelOrEnergy -= distance;
        System.out.println(name + " проехал " + distance + " км по " + terrain);
        return true;
    }

    public String getName() {
        return name;
    }
}