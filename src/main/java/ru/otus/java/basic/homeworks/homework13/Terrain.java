package ru.otus.java.basic.homeworks.homework13;

public enum Terrain {
    PLAIN,
    DENSE_FOREST,
    SWAMP;

    public static Terrain fromString(String name) {
        return switch (name.toLowerCase()) {
            case "равнина" -> PLAIN;
            case "густой лес" -> DENSE_FOREST;
            case "болото" -> SWAMP;
            default -> throw new IllegalArgumentException("Неизвестная местность: " + name);
        };
    }
}
