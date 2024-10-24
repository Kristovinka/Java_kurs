package homework_31;

public class SeasonsApp {
    public static void main(String[] args) {
        for (Seasons seasons : Seasons.values()) {
            System.out.println(seasons);
            System.out.println(seasons.getTemperature());
            System.out.println("============\n");
        }
    }
}
