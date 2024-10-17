package homework_26.task_1;

public class MainApp {
    public static void main(String[] args) {

        Pair<String> pair = new Pair<>("Hello", "World");
        System.out.println("getFirst: " + pair.getFirst()); // Вывод: Hello
        System.out.println("getSecond: " + pair.getSecond()); // Вывод: World

        pair.swap();
        System.out.println("---------swap--------");
        System.out.println("getFirst: " + pair.getFirst()); // Вывод: World
        System.out.println("getSecond: " + pair.getSecond()); // Вывод: Hello

    }
}
