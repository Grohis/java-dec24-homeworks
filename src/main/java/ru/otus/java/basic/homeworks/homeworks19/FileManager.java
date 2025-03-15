package ru.otus.java.basic.homeworks.homeworks19;

import java.io.*;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        //Получаем список текстовых файлов в корневом каталоге проекта
        File directory = new File(".");
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files == null || files.length == 0) {
            System.out.println("Нет текстовых файлов в каталоге.");
            return;
        }

        System.out.println("Доступные файлы:");
        for (File file : files) {
            System.out.println(file.getName());
        }

        //Запрашиваем имя файла у пользователя
        System.out.println("Введите имя файла");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (!file.exists() || !file.isFile()) {
            System.out.println("Файл не найден.");
            return;
        }

        //Читаем содержимое файла в консоль
        System.out.println("Содержимое файла:");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
        }

        // Запись новой строки в файл
        System.out.print("Введите строку для записи в файл: ");
        String inputText = scanner.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.newLine();
            writer.write(inputText);
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}
