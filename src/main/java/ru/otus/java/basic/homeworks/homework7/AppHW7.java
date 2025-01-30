package ru.otus.java.basic.homeworks.homework7;

import java.util.Arrays;
import java.util.Random;

public class AppHW7 {
    public static void main(String[] args) {
        // homeTask1();
        //homeTaskPrintArrayElements();
        // homeTaskZeroDiagonalElements();


    }// main

    private static void homeTaskZeroDiagonalElements() {
        int[][] zeroDiagonalElements = getDataDigit(10, 10);
        for (int i = 0; i < zeroDiagonalElements.length; i++) {
            for (int j = 0; j < zeroDiagonalElements[i].length; j++) {
                if (i == j) {
                    zeroDiagonalElements[i][j] = 0;
                }
                if (i + j == zeroDiagonalElements.length - 1) {
                    zeroDiagonalElements[i][j] = 0;
                }
            }
        }
        printArray(zeroDiagonalElements);
    }

    private static void homeTaskPrintArrayElements() {
        int size = 10;
        printSizeArray(size);
    }

    private static void printSizeArray(int size) {
        char[][] sizeArray = new char[size][size];
        for (int i = 0; i < sizeArray.length; i++) {
            for (int j = 0; j < sizeArray[i].length; j++) {
                sizeArray[i][j] = '*';
            }
        }
        for (int i = 0; i < sizeArray.length; i++) {
            for (int j = 0; j < sizeArray[i].length; j++) {
                System.out.print(sizeArray[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void homeTask1() {
        int[][] integerData = getDataDigit(3, 3);
        printArray(integerData);
        int sumPositiveDigit = sumOfPositiveElements(integerData);
        System.out.println("Сумма положительных чисел двехмерного массива = " + sumPositiveDigit);
    }

    private static int sumOfPositiveElements(int[][] dataDigit) {
        int sumDigit = 0;
        for (int i = 0; i < dataDigit.length; i++) {
            for (int j = 0; j < dataDigit[i].length; j++) {
                if (dataDigit[i][j] > 0) {
                    sumDigit += dataDigit[i][j];
                }
            }
        }
        return sumDigit;
    }

    private static void printArray(int[][] dataDigit) {
        System.out.print("Двухмерный массива имеет следующие значения");
        System.out.println();
        for (int i = 0; i < dataDigit.length; i++) {
            for (int j = 0; j < dataDigit[i].length; j++) {
                System.out.print(dataDigit[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int[][] getDataDigit(int x, int y) {
        int[][] dataDigit = new int[y][x];
        for (int i = 0; i < dataDigit.length; i++) {
            for (int j = 0; j < dataDigit[i].length; j++) {
                dataDigit[i][j] = getDigit();
            }
        }
        return dataDigit;
    }

    private static int getDigit() {
        Random random = new Random();
        int digit = random.nextInt(21) - 10;
        return digit;
    }
}// class
