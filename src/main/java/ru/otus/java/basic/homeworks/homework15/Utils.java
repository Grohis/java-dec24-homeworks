package ru.otus.java.basic.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    // Метод для создания списка последовательных значений в заданном диапазоне
    public static List<Integer> generateSequence(int min, int max) {
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    // Метод для суммирования значений больше 5
    public static int sumGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    // Метод для замены всех элементов списка указанным числом
    public static void fillListWithNumber(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    // Метод для увеличения каждого элемента списка на указанное число
    public static void incrementListElements(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    // Метод для получения списка имен сотрудников
    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee emp : employees) {
            names.add(emp.getName());
        }
        return names;
    }

    // Метод для фильтрации сотрудников по минимальному возрасту
    public static List<Employee> filterByAge(List<Employee> employees, int minAge) {
        List<Employee> filtered = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getAge() >= minAge) {
                filtered.add(emp);
            }
        }
        return filtered;
    }

    // Метод для проверки, превышает ли средний возраст сотрудников указанное значение
    public static boolean isAverageAgeAbove(List<Employee> employees, double minAverageAge) {
        if (employees.isEmpty()) return false;
        double sum = 0;
        for (Employee emp : employees) {
            sum += emp.getAge();
        }
        return (sum / employees.size()) > minAverageAge;
    }

    // Метод для нахождения самого молодого сотрудника
    public static Employee getYoungestEmployee(List<Employee> employees) {
        if (employees.isEmpty()) return null;
        Employee youngest = employees.get(0);
        for (Employee emp : employees) {
            if (emp.getAge() < youngest.getAge()) {
                youngest = emp;
            }
        }
        return youngest;
    }
}
