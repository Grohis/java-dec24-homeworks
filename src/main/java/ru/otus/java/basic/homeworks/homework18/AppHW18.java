package ru.otus.java.basic.homeworks.homework18;

import java.util.Arrays;

public class AppHW18 {
    public static void main(String[] args) {
        PersonDataBase database = new PersonDataBase();

        Person p1 = new Person("Алиса", Position.MANAGER, 1L);
        Person p2 = new Person("Иван", Position.DEVELOPER, 2L);
        Person p3 = new Person("Оля", Position.JANITOR, 3L);

        database.add(p1);
        database.add(p2);
        database.add(p3);

        System.out.println("Найти по id 2: " + database.findById(2L).name);
        System.out.println("Алиса менеджер? " + database.isManager(p1));
        System.out.println("Иван сотрудник? " + database.isEmployee(2L));
        System.out.println("Оля менеджер? " + database.isManager(p3));



        int[] array = {5, 3, 8, 1, 2, 7};
        Sorter.bubbleSort(array);
        System.out.println("Сортировка пузырьком: " + Arrays.toString(array));

        int[] array2 = {5, 3, 8, 1, 2, 7};
        Sorter.quickSort(array2);
        System.out.println("Быстрая сортировка: " + Arrays.toString(array2));
    }
}
