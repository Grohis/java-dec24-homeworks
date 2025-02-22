package ru.otus.java.basic.homeworks.homework13;

class Car extends Transport {
    public Car(int fuel) {
        super("Машина", fuel);
    }

    @Override
    public boolean canMove(Terrain terrain) {
        return terrain == Terrain.PLAIN;
    }
}