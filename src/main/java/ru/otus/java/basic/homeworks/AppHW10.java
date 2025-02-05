package ru.otus.java.basic.homeworks;

import java.util.Random;

public class AppHW10 {
    public static void main(String[] args) {
        Random random = new Random();

        String[] lastName = {"Первый", "Второй", "Третий", "Четвертый"};
        String[] firstName = {"Иван", "Андрей", "Семён", "Марат"};
        String[] middleName = {"Иванов", "Андреевич", "Семёнович", "Маратович"};
        int[] birthYear = {1980, 1990, 2000};
        String[] email = {"1@mail.ru", "2@mail.ru", "3@mail.ru", "4@mail.ru", "5@mail.ru", "5@mail.ru", "7@mail.ru", "8@mail.ru", "9@mail.ru", "10@mail.ru"};

        User[] users = new User[10];
        for (int i = 0; i < users.length; i++) {
            users[i] = new User(
                    getRandomString(lastName, random),
                    getRandomString(firstName, random),
                    getRandomString(middleName, random),
                    getRandomInt(birthYear, random),
                    getRandomString(email, random)
            );
        }

        for (int i = 0; i < users.length; i++) {
            int age = 2025 - users[i].getBirthYear();
            if (age >= 40) {
                users[i].info();
                System.out.println();
            }

        }

    }

    public static String getRandomString (String[]array, Random random){
        int index = random.nextInt(array.length);
        return array[index];
    }

    public static int getRandomInt ( int[] birthYear, Random random){
        int index = random.nextInt(birthYear.length);
        return birthYear[index];
    }
}

