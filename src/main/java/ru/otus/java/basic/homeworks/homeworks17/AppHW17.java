package ru.otus.java.basic.homeworks.homeworks17;

public class AppHW17 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иван Иванов", "123-456");
        phoneBook.add("Иван Иванов", "789-012");
        phoneBook.add("Петр Петров", "555-555");

        System.out.println("Поиск номеров Иван Иванов: " + phoneBook.find("Иван Иванов"));
        System.out.println("Поиск номеров Петр Петров: " + phoneBook.find("Петр Петров"));
        System.out.println("Поиск номеров Василий Васильев: " + phoneBook.find("Василий Васильев"));

        System.out.println("Номер 123-456 в справочнике: " + phoneBook.containsPhoneNumber("123-456"));
        System.out.println("Номер 999-999 в справочнике: " + phoneBook.containsPhoneNumber("999-999"));
    }
}
