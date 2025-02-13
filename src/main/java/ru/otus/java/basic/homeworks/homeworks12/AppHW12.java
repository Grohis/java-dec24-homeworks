package ru.otus.java.basic.homeworks.homeworks12;

public class AppHW12 {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 15),
                new Cat("Кошка", 45)
        };

        for (Cat cat : cats){
            cat.eat(plate);
            cat.info();
        }

    }
}
