
package ru.otus.java.basic.homeworks.homework13;


class Horse extends Transport {
    public Horse(int energy) {
        super("Лошадь", energy);
    }

    @Override
    public boolean canMove(Terrain terrain) {
        return terrain != Terrain.SWAMP;
    }
}