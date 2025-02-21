package ru.otus.java.basic.homeworks.homework13;

abstract class Transport {
    protected String name;
    protected int fuelOrEnergy;

    public Transport(String name, int fuelOrEnergy) {
        this.name = name;
        this.fuelOrEnergy = fuelOrEnergy;
    }

    public abstract boolean canMove(String terrain);

    public abstract boolean move(int distance, String terrain);

    public String getName() {
        return name;
    }
}
