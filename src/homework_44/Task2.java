package homework_44;

import java.util.*;

/*
Имеется список строк. Используя Stream API,
 найдите строку с минимальной длиной.
 */
public class Task2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>
                (List.of("Имеется порядке",
                        "минимальной длиной.",
                        "строк",
                        "удалите их в порядке",
                        "удалите"));

        Optional<String> shortestString = strings.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        if (shortestString.isPresent()) {
            System.out.println("Самая короткая строка: " + shortestString.get());
        } else {
            System.out.println("Список строк пуст.");
        }

    }


}
