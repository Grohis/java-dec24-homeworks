package ru.otus.java.basic.homeworks.homework20.homework;

public class HW20 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        double[] array1 = new SinglThreadArrayFiller().fillArray();
        System.out.println("Однопоточный: " + (System.currentTimeMillis() - start) + " мс");

        start = System.currentTimeMillis();
        double[] array2 = new MultiThreadArrayFiller(4).fillArray();
        System.out.println("Многопоточный: " + (System.currentTimeMillis() - start) + " мс");
    }
}
