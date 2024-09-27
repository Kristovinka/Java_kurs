package lesson_12;

public class ArraysMain {
    public static void main(String[] args) {

        int[] ints = {34, 21, 67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77 };
        System.out.println(ints.length);

        int index = ArraysUtils.linearSearch(ints, 100);
        System.out.println("index: " + index);



    }
}
