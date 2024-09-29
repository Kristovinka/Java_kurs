package homework_14;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = scanner.nextInt();

        if (len <= 0) System.out.println("Так нельзя! ");
        else {
            int[] array = new int[len];

            scanArray(array);
            System.out.println(Arrays.toString(array));
            int summa = sumArray(array);
            System.out.println("Cуммa всех четных элементов в массиве: " + summa);
        }
    }

        public static int sumArray(int[] arr) {
            int i = 0;
            int sum = 0;
            while (i < arr.length) {

                if (arr[i] % 2 == 0)  sum += arr[i];

                i++;
            }
            return sum;

          }


    public static int[] scanArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            arr[i]  = scanner.nextInt();
            i++;
        }
        return arr;
    }

}