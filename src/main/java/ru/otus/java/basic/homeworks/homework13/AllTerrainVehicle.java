package ru.otus.java.basic.homeworks.homework13;

class AllTerrainVehicle extends Transport {
    public AllTerrainVehicle(int fuel) {
        super("Вездеход", fuel);
    }

    @Override
    public boolean canMove(String terrain) {
        return true;
    }

    @Override
    public boolean move(int distance, String terrain) {
        if (fuelOrEnergy < distance) {
            System.out.println(name + " не имеет достаточно топлива");
            return false;
        }
        fuelOrEnergy -= distance;
        System.out.println(name + " проехал " + distance + " км по " + terrain);
        return true;
    }
}
