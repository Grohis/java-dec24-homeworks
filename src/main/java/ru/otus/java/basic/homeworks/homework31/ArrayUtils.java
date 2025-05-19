package ru.otus.java.basic.homeworks.homework31;

import java.util.Arrays;

public class ArrayUtils {

    // 1. Возвращает элементы после последней единицы
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

    // 2. Проверка, что массив содержит только 1 и 2, и есть хотя бы одна 1 и одна 2
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
