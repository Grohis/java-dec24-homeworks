package ru.otus.java.basic.homeworks.homework5;

import java.util.Arrays;
import java.util.Scanner;

public class AppHW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введи слово:");
//        String word = scanner.nextLine();
//        System.out.println("Введи число посторений:");
//        int num = scanner.nextInt();
//        printWordXNum(num, word);

//        int[] arr = {10, 20, 4, 3, -9, -300, 400, 43, 40, 200};
//        sumElementsGreaterThanFive(arr);


//        int[] arr = new int[10];
//        int num = 89;
//        fillArrayWithNumber(89,arr);


//        int[] arr = {-10,-20,-30};
//        int num = 5;
//        incrementArrayElementsBy(num, arr);

//        int[] arr = {100, 120, 150,200,100,50};
//        analyzeArrayHalvesSum(arr);


        int countArray = 3;
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 2};
        int[] arr3 = {1, 1, 1, 1, 1};
        sumArray(countArray, arr1, arr2, arr3);

    }

    public static void printWordXNum(int num, String word) {
        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }
    }

    public static void sumElementsGreaterThanFive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        System.out.println("Сумма чисел, который больше 5 = " + sum);
    }

    public static void fillArrayWithNumber(int num, int[] arr) {
        System.out.println("массив выглядит так = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num;
        }
        System.out.println("теперь массив выглядит так =" + Arrays.toString(arr));
    }

    public static void incrementArrayElementsBy(int num, int[] arr) {
        System.out.println("массив выглядит так = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] += num;
        }
        System.out.println("теперь массив выглядит так =" + Arrays.toString(arr));
    }


    public static void analyzeArrayHalvesSum(int[] arr) {
        System.out.println("массив выглядит так = " + Arrays.toString(arr));
        int sumLeft = 0;
        int sumRayt = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeft += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumRayt += arr[i];
        }
        System.out.println("Сумма левой половины = " + sumLeft);
        System.out.println("Сумма правой половины = " + sumRayt);
        if (sumLeft > sumRayt) {
            System.out.println("Больше левая половина массива");
        } else if (sumRayt > sumLeft) {
            System.out.println("Больше правая половина массива");
        } else {
            System.out.println("Они равны или что то пошло не так");
        }
    }

    public static void sumArray(int countArray, int[] arr1, int[] arr2, int[] arr3) {
        int lenArr = 0;
        if (arr1.length > arr2.length && arr1.length > arr3.length) {
            lenArr = arr1.length;
        } else if (arr2.length > arr3.length && arr2.length > arr3.length) {
            lenArr = arr2.length;
        } else {
            lenArr = arr3.length;
        }
//        System.out.println("длинна lenArr = " + lenArr);
        int[] resultArr = new int[lenArr];
        for (int i = 0; i < arr1.length; i++) {
        resultArr[i] += arr1[i];
        }
        for (int i = 0; i < arr2.length;i++){
            resultArr[i] += arr2[i];
        }
        for (int i = 0; i<arr3.length; i++){
            resultArr[i] += arr3[i];
        }
        System.out.println(Arrays.toString(resultArr));


    }


}//main
