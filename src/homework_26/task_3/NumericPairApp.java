package homework_26.task_3;

public class NumericPairApp {

    public static void main(String[] args) {

        NumericPair<Integer, Double> numericPair =
                new NumericPair<>(10, 5.5);

        System.out.println(numericPair.sum());

        NumericPair<Integer, Integer> numericPair1 =
                new NumericPair<>(100, 25);
        System.out.println(numericPair1.sum());



    }
}
