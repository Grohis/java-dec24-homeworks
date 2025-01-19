package ru.otus.java.basic.homeworks.homework3;

public class AppHW3 {
    public static void main(String[] args) {
//        greetings();
//        checkSing(-10, 5, 5);
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

}
