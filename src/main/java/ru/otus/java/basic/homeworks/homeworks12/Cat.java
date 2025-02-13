package ru.otus.java.basic.homeworks.homeworks12;

public class Cat {
    private String name;
    private int appetit;
    private boolean satiety;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetit)) {
            satiety = true;
        }
    }

    public void info(){
        System.out.println(name + " - Сытость: " + (satiety? "Сыт" : "Голоден"));
    }
}
