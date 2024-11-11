package homework_43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*

Дан список строк.

Используя Stream API, отфильтруйте строки, которые начинаются
на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.

Результат сохраните в новый список строк.

Опционально + удалите дубликаты из списка строк
 */
public class Task_2 {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>
                (List.of("Aлфавитном порядке",
                        "которые",
                        "Aлфавитном порядке",
                        "афавит их в порядке",
                        "Aавитном спискe строк",
                        "удалите"));

        System.out.println("старый список строк: " + strings);


        List<String> result = task2(strings);
        System.out.println("новый список строк: " + result);

    }

    public static List<String> task2 (List<String> strings){

        return strings.stream()
                .filter(s -> s.startsWith(String.valueOf( 'A')) || s.startsWith(String.valueOf('а')))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }
}
