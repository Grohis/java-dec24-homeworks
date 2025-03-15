package ru.otus.java.basic.homeworks.homework18;

public class AppHW18 {
    public static void main(String[] args) {
        PersonDataBase database = new PersonDataBase();

        Person p1 = new Person("Alice", Position.MANAGER, 1L);
        Person p2 = new Person("Bob", Position.DEVELOPER, 2L);
        Person p3 = new Person("Charlie", Position.JANITOR, 3L);

        database.add(p1);
        database.add(p2);
        database.add(p3);

        System.out.println("Find by ID 2: " + database.findById(2L).name);
        System.out.println("Is Alice a manager? " + database.isManager(p1));
        System.out.println("Is Bob an employee? " + database.isEmployee(2L));
        System.out.println("Is Charlie a manager? " + database.isManager(p3));
    }
}
