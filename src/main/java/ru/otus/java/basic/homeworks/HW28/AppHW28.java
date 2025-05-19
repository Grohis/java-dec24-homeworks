package ru.otus.java.basic.homeworks.HW28;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AppHW28  {
    public static void main(String[] args) {
        String filePath = "src/main/java/ru/otus/java/basic/homeworks/HW28/data.txt";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для поиска: ");
        String searchString = scanner.nextLine();

        try {
            int count = countOccurrences(filePath, searchString);
            System.out.println("Количество вхождений: " + count);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static int countOccurrences(String filePath, String searchString) throws IOException {
        int count = 0;

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                count += countOccurrencesInLine(line, searchString);
            }
        }

        return count;
    }

    private static int countOccurrencesInLine(String line, String searchString) {
        int count = 0;
        int index = 0;

        while ((index = line.indexOf(searchString, index)) != -1) {
            count++;
            index += searchString.length();
        }

        return count;
    }
}
