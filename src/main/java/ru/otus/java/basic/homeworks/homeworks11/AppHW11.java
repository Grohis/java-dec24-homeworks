package ru.otus.java.basic.homeworks.homeworks11;

public class AppHW11 {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 5, 0, 10);
        Dog jeck = new Dog("Джек", 6, 2, 20);
        Horse star = new Horse("Звезда", 10, 4, 30);

        barsik.run(8);
        barsik.swim(5);
        barsik.info();

        jeck.run(10);
        jeck.swim(5);
        jeck.info();

        star.run(15);
        star.swim(6);
        star.info();
    }
}
