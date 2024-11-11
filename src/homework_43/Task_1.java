package homework_43;

import org.apiguardian.api.API;

import java.util.List;
import java.util.stream.Collectors;

//Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.
//
//В новом списке должны быть только те числа из старого списка,
// которые соответствуют всем условиям: четные, больше 10 и меньше 100
//
//Для фильтрации используйте Stream API

public class Task_1 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(-1, 40, -203, 12, 0, 5, 96, 1, -15, 24, 87);
        System.out.println("старый список чисел: " + integers);

        List<Integer> result = task1(integers);
        System.out.println( "отфильтрованный список: " + result);
    }


    private static List<Integer> task1(List<Integer> integers) {

        return  integers.stream() // создание потока на основе элементов списка
                .filter(i -> i > 0 && i < 100 && i % 2 == 0) // фильтрация элементов потока
                .collect(Collectors.toList());

    }

}
