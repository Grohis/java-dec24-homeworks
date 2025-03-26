package ru.otus.java.basic.homeworks.homework20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(7707)) {
            System.out.println("Сервер запущен. Ожидание подключения...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(() -> handleClient(clientSocket)).start();
            }
        } catch (IOException e) {
            System.err.println("Ошибка сервера: " + e.getMessage());
        }
    }

    private static void handleClient(Socket clientSocket) {
        String clientInfo = clientSocket.getInetAddress() + ":" + clientSocket.getPort();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

            System.out.println("Клиент подключился: " + clientInfo);

            out.println("Доступные операции: +, -, *, /");

            double num1 = Double.parseDouble(in.readLine());
            double num2 = Double.parseDouble(in.readLine());
            char operation = in.readLine().charAt(0);

            double result = Calculator.calculate(num1, num2, operation);
            out.println("Результат: " + result);

            System.out.println("Клиент отключился: " + clientInfo);

        } catch (IOException e) {
            System.err.println("Ошибка связи с клиентом " + clientInfo + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Клиент " + clientInfo + " отправил некорректные данные");
        } catch (Exception e) {
            System.err.println("Ошибка обработки клиента " + clientInfo + ": " + e.getMessage());
        }
    }
}