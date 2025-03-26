package ru.otus.java.basic.homeworks.homework20.homework;

public class SinglThreadArrayFiller {
    public double[] fillArray() {
        double[] array = new double[100_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
        return array;
    }
}
