package ru.otus.java.basic.homeworks.HW30;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppHW30 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        // Создаем пул на 3 потока
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(() -> printer.printLetter("A", 0));
        executor.execute(() -> printer.printLetter("B", 1));
        executor.execute(() -> printer.printLetter("C", 2));

        executor.shutdown();
    }
}