package ru.otus.java.basic.homeworks.homework13;

class Bicycle extends Transport {
    public Bicycle() {
        super("Велосипед", Integer.MAX_VALUE);
    }

    @Override
    public boolean canMove(String terrain) {
        return !terrain.equals("болото");
    }

    @Override
    public boolean move(int distance, String terrain) {
        if (!canMove(terrain)) {
            System.out.println(name + " не может двигаться по " + terrain);
            return false;
        }
        System.out.println(name + " проехал " + distance + " км по " + terrain);
        return true;
    }
}
