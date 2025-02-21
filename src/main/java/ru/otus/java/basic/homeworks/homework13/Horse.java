package ru.otus.java.basic.homeworks.homework13;

class Horse extends Transport {
    public Horse(int energy) {
        super("Лошадь", energy);
    }

    @Override
    public boolean canMove(String terrain) {
        return !terrain.equals("болото");
    }

    @Override
    public boolean move(int distance, String terrain) {
        if (!canMove(terrain) || fuelOrEnergy < distance) {
            System.out.println(name + " не может двигаться по " + terrain);
            return false;
        }
        fuelOrEnergy -= distance;
        System.out.println(name + " прошла " + distance + "км по " + terrain);
        return true;
    }
}
