package ru.otus.java.basic.homeworks.HW27;

public class appHW27 {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Вес appleBox1: " + appleBox1.getWeight());
        System.out.println("Вес orangeBox: " + orangeBox.getWeight());

        System.out.println("Сравнение коробок: " + appleBox1.compare(orangeBox));

        // Пересыпаем яблоки
        System.out.println("До пересыпания: appleBox2 = " + appleBox2.getCount());
        appleBox1.transferFruitsTo(appleBox2);
        System.out.println("После пересыпания: appleBox2 = " + appleBox2.getCount());
        System.out.println("appleBox1 теперь: " + appleBox1.getCount());
    }
}
