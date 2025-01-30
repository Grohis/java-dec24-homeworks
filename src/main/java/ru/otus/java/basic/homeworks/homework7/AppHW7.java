package ru.otus.java.basic.homeworks.homework7;

import java.util.Arrays;
import java.util.Random;

public class AppHW7 {
    public static void main(String[] args) {


        getSumPositivElements();


    }// main

    private static void getSumPositivElements() {
        int sumDigit = 0;

        int[][] dataDigit = getDataDigit(3,3);
        System.out.print("Двухмерный массива имеет следующие значения");
        System.out.println();
        for (int i = 0; i < dataDigit.length; i++) {
            for (int j = 0; j < dataDigit[i].length ; j++) {
                System.out.print(dataDigit[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < dataDigit.length; i++) {
            for (int j = 0; j < dataDigit[i].length; j++) {
                if (dataDigit[i][j] > 0){
                    sumDigit += dataDigit[i][j];
                }
            }
        }
        System.out.print("Сумма положительных чисел двухмерного массива = " + sumDigit);
    }

    private static int[][] getDataDigit(int x, int y) {
        int[][] dataDigit = new int [y][x];
        for (int i = 0; i <dataDigit.length; i++){
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
