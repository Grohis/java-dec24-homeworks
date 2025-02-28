package ru.otus.java.basic.homeworks.homework15;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    // Метод для создания списка последовательных значений в заданном диапазоне
    public static List<Integer> generateSequence(int min, int max){
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    // Метод для суммирования значений больше 5
    public static int sumGreaterThanFive(List<Integer> numbers){
        int sum = 0;
        for (int num : numbers){
            if (num > 5){
                sum += num;
            }
        }
        return sum;
    }

    // Метод для замены всех элементов списка указанным числом
    public static void fillListWithNumber(List<Integer> list, int number){
        for (int i=0; i < list.size(); i++){
            list.set(i, number);
        }
    }

    // Метод для увеличения каждого элемента списка на указанное число
    public  static void incrementListElements(List<Integer> list, int number){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    // Метод для получения списка имен сотрудников
    public static List<String> getEmployeeNames(List<Employee> employees){
        List<String> names = new ArrayList<>();
        for (Employee emp : employees){
            names.add(emp.getName());
        }
        return names;
    }
}
