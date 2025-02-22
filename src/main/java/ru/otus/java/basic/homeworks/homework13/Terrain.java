package ru.otus.java.basic.homeworks.homework13;

enum Terrain {
    DENSE_FOREST("густой лес"),
    PLAIN("равнина"),
    SWAMP("болото");

    private final String name;

    Terrain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
