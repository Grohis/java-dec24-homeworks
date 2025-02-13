package ru.otus.java.basic.homeworks.homeworks11;

class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public float swim(int distance) {
        int staminaRequired = distance * 4;
        if (staminaRequired > stamina) {
            System.out.println(name + " устал и не может проплыть " + distance + " м.");
            return -1;
        }
        stamina -= staminaRequired;
        float time = distance / swimSpeed;
        System.out.println(name + " проплыл " + distance + " м за " + time + " сек.");
        return time;
    }
}
