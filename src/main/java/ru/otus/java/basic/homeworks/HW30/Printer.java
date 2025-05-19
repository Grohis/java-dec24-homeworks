package ru.otus.java.basic.homeworks.HW30;

public class Printer {
    private int turn = 0;
    private final int totalRepetitions = 5;

    public void printLetter(String letter, int order) {
        for (int i = 0; i < totalRepetitions; ) {
            synchronized (this) {
                if (turn == order) {
                    System.out.print(letter);
                    turn = (turn + 1) % 3;
                    i++;
                    this.notifyAll();
                } else {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }
            }
        }
    }
}
