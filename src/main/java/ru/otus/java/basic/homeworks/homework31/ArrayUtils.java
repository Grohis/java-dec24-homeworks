package ru.otus.java.basic.homeworks.homework31;

import java.util.Arrays;

/**
 * Утилитный класс с методами для работы с массивами.
 */
public class ArrayUtils {

    /**
     * Возвращает элементы массива, расположенные после последней единицы (1).
     *
     * @param arr исходный массив
     * @return массив элементов, следующих за последней единицей
     * @throws RuntimeException если в массиве нет ни одной единицы
     */
    public static int[] elementsAfterLastOne(int[] arr) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                lastIndex = i;
            }
        }
        if (lastIndex == -1) {
            throw new RuntimeException("Массив не содержит единиц");
        }
        return Arrays.copyOfRange(arr, lastIndex + 1, arr.length);
    }

    /**
     * Проверяет, что массив состоит только из единиц (1) и двоек (2),
     * и содержит хотя бы одну единицу и одну двойку.
     *
     * @param arr массив для проверки
     * @return true, если условие выполнено, иначе false
     */
    public static boolean checkArray(int[] arr) {
        boolean hasOne = false;
        boolean hasTwo = false;

        for (int num : arr) {
            if (num == 1) {
                hasOne = true;
            } else if (num == 2) {
                hasTwo = true;
            } else {
                return false; // есть число не 1 и не 2
            }
        }

        return hasOne && hasTwo;
    }
}
