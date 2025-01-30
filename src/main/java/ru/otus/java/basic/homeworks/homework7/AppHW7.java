package ru.otus.java.basic.homeworks.homework7;

import java.util.Arrays;
import java.util.Random;

public class AppHW7 {
    public static void main(String[] args) {
        // homeTask1();
        //homeTaskPrintArrayElements();
        // homeTaskZeroDiagonalElements();
        //homeTaskGetMaxInteger();
        // Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
        // если второй строки не существует, то в качестве результата необходимо вернуть -1
        int result = homeTaskGetResultTwoLine();
        System.out.println("Результат = " + result);


    }// main

    private static int homeTaskGetResultTwoLine() {
        // todo  выяснить почему не работает
        int[][] dataInteger = getDataDigit(3, 3);
        printArray(dataInteger);
        int result = -1;
        if (dataInteger.length < 2) {
            System.out.print("Вторая строк отсутствует");
            return result;
        }
        for (int i = 0; i < dataInteger.length; i++) {
            for (int j = 0; j < dataInteger[i].length; j++) {
                if (i == 1) {
                    result += dataInteger[i][i];
                }
            }
            return result + 1;
        }
    }


    private static void homeTaskGetMaxInteger() {
        int[][] dataInteger = getDataDigit(7, 7);
        int maxInteger = MaxInteger(dataInteger);
        System.out.print("Максимальный элемент массива = " + maxInteger);
    }

    private static int MaxInteger(int[][] dataInteger) {
        int maxInteger = 0;
        for (int i = 0; i < dataInteger.length; i++) {
            for (int j = 0; j < dataInteger[i].length; j++) {
                if (dataInteger[i][j] > maxInteger) {
                    maxInteger = dataInteger[i][j];
                }
            }
        }
        return maxInteger;
    }

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
