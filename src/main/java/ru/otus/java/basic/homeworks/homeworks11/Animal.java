package ru.otus.java.basic.homeworks.homeworks11;

public class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;


    public Animal(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.runSpeed = speedRun;
        this.swimSpeed = speedSwim;
        this.stamina = stamina;

    }

    public float run(int distance) {
        int stamineRequire = distance;
        if (stamineRequire > stamina) {
            System.out.println(name + " устал и не может пробежать " + distance);
            return -1;
        }
        stamina -= stamineRequire;
        float time = distance / runSpeed;
        System.out.println(name + " пробежал " + distance + " м за " + time + " сек.");
        return time;
    }

    public float swim(int distance) {
        System.out.println(name + " не умеет плавать.");
        return -1;
    }

    public void info() {
        System.out.println(name + " - Выносливость: " + stamina + " ye.");
    }
}

