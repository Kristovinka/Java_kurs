package lesson_13;

import lesson_13.ArraysUtils;

import java.util.Arrays;

/**
 * @author Sergey Bugaenko
 * {@code @date} 25.09.2024
 */

public class ArraysMain {
    public static void main(String[] args) {



        int[] ints = {34, 21, 67, 41, 10, 80, 0, 87, 99, 38, 57, 3, 77 };
        System.out.println(ints.length);

        int index = ArraysUtils.linearSearch(ints, 100);
        System.out.println("index: " + index);

        System.out.println("Массив до сортировки: ");
        System.out.println(Arrays.toString(ints));

        ArraysUtils.sortSelection(ints);

        System.out.println("Массив после сортировки: ");
        System.out.println(Arrays.toString(ints));




    }
}
