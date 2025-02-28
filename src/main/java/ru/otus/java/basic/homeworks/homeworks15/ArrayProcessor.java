package ru.otus.java.basic.homeworks.homeworks15;

public class ArrayProcessor {
    private static final int REQUIRED_SIZE = 4;

    public static int processArray(String[][] array) throws ArraySizeException, ArrayDataException {
        if (array.length != REQUIRED_SIZE || anyRowInvalid(array)) {
            throw new ArraySizeException("Массив должен иметь размер 4х4");
        }

        int sum = 0;
        for (int i = 0; i < REQUIRED_SIZE; i++) {
            for (int j = 0; j < REQUIRED_SIZE; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Ошибка в ячейке: [" + i + "," + j + "] - некорректное значение: " + array[i][j]);
                }
            }
        }
        return sum;
    }

    private static boolean anyRowInvalid(String[][] array) {
        for (String[] row : array) {
            if (row.length != REQUIRED_SIZE) {
                return true;
            }
        }
        return false;
    }
}
