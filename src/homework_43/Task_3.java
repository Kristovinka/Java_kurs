package homework_43;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
Дан список Person с полями name, age, city. Используйте Stream API для фильтрации людей,
 которые старше определенного возраста и проживают в определенном городе,
  а затем соберите их в список.

Например, старше 25 лет и проживающих в городе "Berlin"
 */
public class Task_3 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(List.of(
                new Person("Löcha", 25, "Berlin"),
                new Person("Saniy", 27, "Augsburg"),
                new Person("Serg", 43, "Berlin"),
                new Person("Ivan", 63, "Frankfurt"),
                new Person("Kopatich", 44, "Berlin"))

        );
        System.out.println(people);


        List<Person> result = task3(people);
        System.out.println(result);
    }

    private static List<Person> task3(List<Person> people) {

         return people.stream()
                .filter(cat -> cat.getAge() > 25)
                .filter(cat -> cat.getCity().equals("Berlin"))
                .collect(Collectors.toList());
    }
}
