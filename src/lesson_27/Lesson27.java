package lesson_27;

import lists.MyArrayList;

import java.util.Arrays;


public class Lesson27 {
    public static void main(String[] args) {

        MyArrayList<Integer> integers = new MyArrayList<>();

        integers.addAll(1, 5, 7, 98, 100, 500);
        System.out.println(integers);

        integers.add(1000);
        System.out.println(integers);

        System.out.println("size: " + integers.size());

        System.out.println("isEmpty: " + integers.isEmpty());

        int idx = integers.indexOf(100);
        System.out.println("integers.indexOf(100): " + idx);

        integers.set(idx, -200);
        System.out.println(integers);

        System.out.println("contains 500: " + integers.contains(500));
        System.out.println("contains 55: " + integers.contains(55));

        Integer value = integers.get(50);
        System.out.println("value: " + value);
        value = integers.get(3);
        System.out.println("value: " + value);

        System.out.println("\n ======================= \n");
        System.out.println(integers.remove(3));
        System.out.println(integers);
        System.out.println(integers.remove(Integer.valueOf(500)));
        System.out.println(integers);

        System.out.println("\n ===================== \n");

        Integer[] array = integers.toArray();
        System.out.println(Arrays.toString(array));



    }
}