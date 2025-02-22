package ru.otus.java.basic.homeworks.homework13;

class Bicycle extends Transport {
    public Bicycle() {
        super("Велосипед", Integer.MAX_VALUE);
    }

    @Override
    public boolean canMove(Terrain terrain) {
        return terrain != Terrain.SWAMP;
    }
}