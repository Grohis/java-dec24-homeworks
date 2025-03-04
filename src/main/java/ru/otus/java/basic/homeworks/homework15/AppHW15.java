package ru.otus.java.basic.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

import static ru.otus.java.basic.homeworks.homework15.Utils.generateSequence;
import static ru.otus.java.basic.homeworks.homework15.Utils.sumGreaterThanFive;

public class AppHW15 {
    public static void main(String[] args) {
        List<Integer> numbers = Utils.generateSequence(1, 10);
        System.out.println("Список чисел: " + numbers);
        System.out.println("Сумма чисел больше 5: " + sumGreaterThanFive(numbers));

        Utils.fillListWithNumber(numbers, 3);
        System.out.println("Список после заполнения числом 3: " + numbers);

        Utils.incrementListElements(numbers, 2);
        System.out.println("Список после увеличения на 2: " + numbers);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Иван", 25));
        employees.add(new Employee("Мария", 30));
        employees.add(new Employee("Петр", 22));

        System.out.println("Имена сотрудников: " + Utils.getEmployeeNames(employees));
        System.out.println("Сотрудники старше 25: " + Utils.filterByAge(employees, 25));
        System.out.println("Средний возраст больше 26? " + Utils.isAverageAgeAbove(employees, 26));
        System.out.println("Самый молодой сотрудник: " + Utils.getYoungestEmployee(employees).getName());
    }
}
