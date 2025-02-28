package ru.otus.java.basic.homeworks.homeworks15;

public class AppHW15 {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "six", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = ArrayProcessor.processArray(validArray);
            System.out.println("Сумма элементов: " + sum);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            ArrayProcessor.processArray(invalidSizeArray);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            ArrayProcessor.processArray(invalidDataArray);
        } catch (ArraySizeException | ArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
