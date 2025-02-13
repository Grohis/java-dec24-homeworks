package ru.otus.java.basic.homeworks.homeworks11;

public class Dog extends Animal {
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public float swim(int distance) {
        int staminaRequire = distance * 2;
        if (staminaRequire > stamina) {
            System.out.println(name + " устал и не может проплыть " + distance);
            return -1;
        }
        stamina -= staminaRequire;
        float time = distance / swimSpeed;
        System.out.println(name + " проплыл " + distance + " м за " + time + " сек.");
        return time;
    }
}
