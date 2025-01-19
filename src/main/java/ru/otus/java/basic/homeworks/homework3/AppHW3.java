package ru.otus.java.basic.homeworks.homework3;

import java.util.Scanner;

public class AppHW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выбери команду 1 - 5 или 0 для выхода");
            int user = scanner.nextInt();

            if (user == 0) {
                System.out.println("Выход из программы");
                break;
            }

            if (user >= 1 && user <= 5) {
                if (user == 1) {
                    greetings();
                } else if (user == 2) {
                    System.out.println("Введи три числа:");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    checkSing(a, b, c);
                } else if (user == 3) {
                    selectColor();
                } else if (user == 4) {
                    compareNumbers();
                } else if (user == 5) {
                    System.out.println("Введи два числа и условие:");
                    int initValue = scanner.nextInt();
                    int delta = scanner.nextInt();
                    boolean increment = scanner.nextBoolean(); // ожидает true или false
                    addOrSubtractAndPrint(initValue, delta, increment);
                }
            } else {
                System.out.println("Неверная команда");
            }
        }
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
        } else if (data <= 20) {
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
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }
}
