package ru.otus.java.basic.homeworks.homework13;

class AllTerrainVehicle extends Transport {
    public AllTerrainVehicle(int fuel) {
        super("Вездеход", fuel);
    }

    @Override
    public boolean canMove(Terrain terrain) {
        return true;
    }
}