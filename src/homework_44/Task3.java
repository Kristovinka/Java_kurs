package homework_44;

import java.util.List;
import java.util.stream.Collectors;

/*
Имеется список целых чисел.

Необходимо отфильтровать этот список, оставив только чётные числа,
затем каждое число умножить на 2, и собрать результат в новый список

 */
public class Task3 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(-1, 40, -203, 12, 0, 5, 96, 1, -15, 24, 87);
        System.out.println("старый список чисел: " + integers);

        List<Integer> transformedNumbers = integers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println("Преобразованный список:" + transformedNumbers);

    }
}
