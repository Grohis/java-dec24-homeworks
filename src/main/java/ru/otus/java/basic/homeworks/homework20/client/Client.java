package ru.otus.java.basic.homeworks.homework20.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 7707);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Подключено к серверу.");
            System.out.println(in.readLine()); // Список операций

            // Пошаговый ввод
            System.out.print("Введите первое число: ");
            out.println(scanner.nextLine()); // Отправка числа 1

            System.out.print("Введите второе число: ");
            out.println(scanner.nextLine()); // Отправка числа 2

            System.out.print("Введите операцию (+, -, *, /): ");
            out.println(scanner.nextLine().charAt(0)); // Отправка символа

            // Результат
            System.out.println(in.readLine());

        } catch (IOException e) {
            System.err.println("Ошибка подключения: " + e.getMessage());
        }
    }
}