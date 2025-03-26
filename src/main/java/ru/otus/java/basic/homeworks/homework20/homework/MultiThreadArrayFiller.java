package ru.otus.java.basic.homeworks.homework20.homework;

public class MultiThreadArrayFiller {
    private final int threadsCount;

    public MultiThreadArrayFiller(int threadsCount) {
        this.threadsCount = threadsCount;
    }

    public double[] fillArray() {
        double[] array = new double[100_000_000];
        Thread[] threads = new Thread[threadsCount];
        int partSize = array.length / threadsCount;

        for (int t = 0; t < threadsCount; t++) {
            final int threadNum = t;
            threads[t] = new Thread(() -> {
                int start = threadNum * partSize;
                int end = (threadNum == threadsCount - 1) ? array.length : start + partSize;
                for (int i = start; i < end; i++) {
                    array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
                }
            });
            threads[t].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return array;
    }
}
