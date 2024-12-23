package lesson_45.hw_44;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserApp {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of(
                new User(1, "Peter"),
                new User(2, "John"),
                new User(3, "Max"),
                new User(4, "Hanna")
        ));

//        Optional<User> user = findUserById(users, 1);
//
//        user.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));

        Optional<User> user1 = findUserById2(users, 1);

        user1.ifPresentOrElse(System.out::println, () -> System.out.println("User not found"));
    }

    public static Optional<User> findUserById(List<User> users, int id) {

        for (User user : users) {
            if (user.getId() == id) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    // Терминальный метод, возвращающий Optional, в который завернут первый элемент потока (если он есть) или пустой Optional
    public static Optional<User> findUserById2(List<User> users, int id) {
//        users.stream()
//                .filter(user -> user.getId() == id)
//                .peek(System.out::println)
//                .collect(Collectors.toList());

        System.out.println("\n===========\n");

        // findFirst - Терминальный метод, возвращающий Optional, в который завернут первый элемент потока (если он есть) или пустой Optional
        // Прекращает обработку потока, когда будет найден первый элемент
        Optional<User> user = users.stream()
                .filter(user1 -> user1.getId() == id)
                .peek(System.out::println)
                .findFirst();

        System.out.println(users);

        return user;
    }
}