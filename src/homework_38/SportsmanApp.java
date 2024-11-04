package homework_38;

import lesson_38.Car;
import lesson_38.CarSpeedComparator;

import java.util.Arrays;
import java.util.Comparator;

public class SportsmanApp {
    public static void main(String[] args) {
        Sportsman[] sportsmen = new Sportsman[5];
        sportsmen[0] = new Sportsman("Bob", 1997, "beginner");
        sportsmen[1] = new Sportsman("Karl", 1984, "pro");
        sportsmen[2] = new Sportsman("Adolf", 2001, "middle");
        sportsmen[3] = new Sportsman("Josef", 1989, "pro");
        sportsmen[4] = new Sportsman("Fredy", 2000, "beginner");

        System.out.println(Arrays.toString(sportsmen));
        System.out.println("\n ====================== \n");

        Arrays.sort(sportsmen);

        System.out.println("age sort: \n" + Arrays.toString(sportsmen));

        System.out.println("\n ====================== \n");
        ScoreComparator scoreComparator = new ScoreComparator();

        Arrays.sort(sportsmen, scoreComparator);

        System.out.println("score sort: \n" + Arrays.toString(sportsmen));
        System.out.println("\n ====================== \n");

        // Анонимный класс
        Arrays.sort(sportsmen, new Comparator<Sportsman>() {

            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {
                return sportsman1.getName().compareTo(sportsman2.getName());
            }
        });

        System.out.println("Name sort: \n" + Arrays.toString(sportsmen));
    }
}
