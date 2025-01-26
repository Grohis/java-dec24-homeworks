package ru.otus.java.basic.homeworks.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppHW5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();


        while (true) {
            printMenu();

            int numProgram = scanner.nextInt();
            scanner.nextLine(); // Очищаем \n после nextInt()

            if (numProgram == 1) {
                System.out.println("Введи слово: ");
                String word = scanner.nextLine();

                System.out.println("Введи число повторения: ");
                int iteration = scanner.nextInt();
                scanner.nextLine();
                printWordIteration(iteration, word);
            } else if (numProgram == 2) {
                int[] dataInteger = genRandomDataInteger(rnd);
                sumElementsGreaterThanFive(dataInteger);
            } else if (numProgram == 3) {
                System.out.println("Введи длинну массива : ");
                int lenDataInteger = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Введи число для заполнения массиива :");
                int valueInteger = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Создан массив длинной" + lenDataInteger + "элементов, число для заполнения " + valueInteger);
                int[] DataInteger = new int[lenDataInteger];

                setArrayElementsToValue(valueInteger, DataInteger);
            } else if (numProgram == 4) {
                int[] DataInteger = genRandomDataInteger(rnd);
                System.out.println("Рандом массив выглядит так: " + Arrays.toString(DataInteger));
                System.out.println("Введи число:");
                int valueDigit = scanner.nextInt();
                incrementArrayElementsBy(valueDigit, DataInteger);
            } else if (numProgram == 5) {
                int lenDataInteger = rnd.nextInt(25) + 4;
                int[] dataInteger = genRandomDataInteger(rnd);
                System.out.println("Массив рандомной длинны и с рандомными числами готов");
                System.out.println(Arrays.toString(dataInteger));
                analyzeArrayHalvesSum(dataInteger);
            } else if (numProgram == 6) {
                int[] arr1 = genRandomDataInteger(rnd);
                int[] arr2 = genRandomDataInteger(rnd);
                int[] arr3 = genRandomDataInteger(rnd);
                System.out.println(Arrays.toString(arr1));
                System.out.println(Arrays.toString(arr2));
                System.out.println(Arrays.toString(arr3));
                sumArray(arr1, arr2, arr3);
            } else if (numProgram == 7) {
                int[] dataInteger = genRandomDataInteger(rnd); // как управлять вероятностью баланса (return true)?
               // int[] dataInteger = { 7, 2, 2, 2 };
                balansPoint(dataInteger);

            } else if (numProgram == 8) {
                int[] randomArray = genRandomDataInteger(rnd);
                printDigestingArray(randomArray);

            } else if (numProgram == 0) {
                System.out.println("Выход из программы...");
                break;
            } else {
                System.out.println("Ошибка! Выберите существующую программу.");
            }

            if (goProgramm(scanner)) break;
        }// while


    }// main

    private static void balansPoint(int[] dataInteger) {
//        System.out.println("dataInteger = " + Arrays.toString(dataInteger));
        System.out.println("dataInteger = " + Arrays.toString(dataInteger)); // soutp
        int totalSum = 0;

        for (int i = 0; i < dataInteger.length; i++) {
            totalSum += dataInteger[i];
//            System.out.println("totalSum" + totalSum);
            // как поставить лог, а не print ???
        }
        System.out.println("totalSum" + totalSum);
        int leftSum = 0;
        int rightSum = totalSum;
        for (int i = 0; i < dataInteger.length; i++) {
            if (leftSum == rightSum) {
                System.out.println("Точка баланса найдена на индексе: " + i);
                return; // завершаем метод при первом находе.
            }
            rightSum -= dataInteger[i];
            leftSum += dataInteger[i];
        }
        System.out.println("Точка баланса не найдена");
        //return false;
    }

    private static boolean goProgramm(Scanner scanner) {
        System.out.println("Хочешь выбрать другую программу?");
        System.out.println("1 - да \n0 - выход");
        int go = scanner.nextInt();
        scanner.nextLine();
        if (go == 0) {
            System.out.println("Выход из программы");
            return true;
        }
        return false;
    }

    private static void printWordIteration(int iteration, String word) {
        for (int i = 0; i < iteration; i++) {
            System.out.println(word);
        }
    }

    private static void printMenu() {
        System.out.println("\nПрограмма умеет:");
        System.out.println("1 - Напечать слово N раз");
        System.out.println("2 - Посчитать сумму чисел, больше значения");
        System.out.println("3 - Установить элементы массива в значение");
        System.out.println("4 - Увеличить каждый элемент массива на число");
        System.out.println("5 - Правая или левая часть больше");
        System.out.println("6 - Суммирует элементы трех массивов");
        System.out.println("7 - Определение 'точки' в массиве");
        System.out.println("8 - Реверс массива");
        System.out.println("0 - Выход");
        System.out.print("Выберите программу >> ");
    }

    private static int[] genRandomDataInteger(Random random) {
        Random rnd = new Random();
        int lenDataInteger = rnd.nextInt(25) + 4;
        int[] dataInteger = new int[lenDataInteger];
        for (int i = 0; i < lenDataInteger; i++) {
            dataInteger[i] = rnd.nextInt(100);
        }
        return dataInteger;
    }

    public static void sumElementsGreaterThanFive(int[] arr) {
        System.out.println("Исходный массива = " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
            }
        }
        // System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("Сумма чисел, который больше 5 = " + sum);
    }

    //Установить элементы массива в значение
    public static void setArrayElementsToValue(int valueInteger, int[] DataInteger) {

        // System.out.println("массив выглядит так = " + Arrays.toString(DataInteger));
        for (int i = 0; i < DataInteger.length; i++) {
            DataInteger[i] = valueInteger;
        }
        System.out.println("Результат = " + Arrays.toString(DataInteger));
    }


    // увеличить на число
    public static void incrementArrayElementsBy(int num, int[] arr) {
        System.out.println("массив выглядит так = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] += num;
        }
        System.out.println("теперь массив выглядит так =" + Arrays.toString(arr));
    }


    public static void analyzeArrayHalvesSum(int[] arr) {
        int sumLeft = 0;
        int sumRayt = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumLeft += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumRayt += arr[i];
        }
        if (sumLeft > sumRayt) {
            System.out.println("Больше левая половина массива");
        } else if (sumRayt > sumLeft) {
            System.out.println("Больше правая половина массива");
        } else {
            System.out.println("Они равны");
        }
        System.out.println("Сумма левой половины = " + sumLeft);
        System.out.println("Сумма правой половины = " + sumRayt);
    }

    public static void sumArray(int[] arr1, int[] arr2, int[] arr3) {
        System.out.println("первый радомный массив: " + Arrays.toString(arr1));
        System.out.println("второй радомный массив: " + Arrays.toString(arr2));
        System.out.println("третий радомный массив: " + Arrays.toString(arr3));

        // todo Как создать массив c N элементов, с вложенными массивами M длинны и рандомными числами
        int lenArr = 0;
        if (arr1.length > arr2.length && arr1.length > arr3.length) {
            lenArr = arr1.length;
        } else if (arr2.length > arr3.length && arr2.length > arr3.length) {
            lenArr = arr2.length;
        } else {
            lenArr = arr3.length;
        }
        //System.out.println("длинна lenArr = " + lenArr);
        int[] resultArr = new int[lenArr];
        for (int i = 0; i < arr1.length; i++) {
            resultArr[i] += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            resultArr[i] += arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            resultArr[i] += arr3[i];
        }
        System.out.println("Результат");
        System.out.println(Arrays.toString(resultArr));
    }

    public static void printDigestingArray(int[] arr) {
        int lenArr = arr.length;
        int[] digestingArray = new int[lenArr];
        System.out.println("получен массив arr = " + Arrays.toString(arr));
        for (int i = 0; i < lenArr; i++) {
            digestingArray[i] = arr[lenArr - 1 - i];
        }
        System.out.println("Массив в обратном порядке : " + Arrays.toString(digestingArray));
    }


}//class