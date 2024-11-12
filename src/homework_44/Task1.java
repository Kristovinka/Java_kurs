package homework_44;

/*
Из списка целых чисел выделите те значения, которые больше 10;
 отсортируйте эти значения по значению последней цифры в числе
  и выведите результат на экране
 */

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(5, 4, 14, 38, 42, 91, 24, -1, -6);

        List<Integer> filteredAndSorted = integers.stream()
                .filter(i -> i > 10)
                .sorted((a, b) -> Integer.compare(Math.abs(a % 10), Math.abs(b % 10)))
                .collect(Collectors.toList());

        System.out.println("Отфильтрованный и отсортированный список:" + filteredAndSorted);

    }

}
