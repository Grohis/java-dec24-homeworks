package ru.otus.java.basic.homeworks.homework3;

import ru.otus.java.basic.homeworks.Main;

public class AppHW3 {
    public static void main(String[] args) {
//        greetings();
//        checkSing(-10, 5, 5);
//        selectColor();
//        compareNumbers();
        addOrSubtractAndPrint(100,10,false);
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\njava");
    }


    public static void checkSing(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void selectColor() {
        int data = 1 + (int) (Math.random() * 30);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true){
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

}
