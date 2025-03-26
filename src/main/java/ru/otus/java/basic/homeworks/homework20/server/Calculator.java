package ru.otus.java.basic.homeworks.homework20.server;

public class Calculator {
    public static double calculate(double num1, double num2, char operation) {
        return switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            default -> throw new IllegalArgumentException("Неизвестная операция: " + operation);
        };
    }
}
