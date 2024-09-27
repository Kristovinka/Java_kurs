package homework_08;

import java.util.Random;

public class HomeWork_8 {
    public static void main(String[] args) {

                    // task1

        System.out.println("---------task1----------");
        int[] nums = new int[15];
        int k = 0;
        int mult = 1;

        System.out.print("[");
        while (k < nums.length) {
            nums[k] = k+1;
            System.out.print(nums[k] + ", ");
            mult = mult * nums[k];
            k++;
        }
        System.out.println("]");
        System.out.println("произведение всех чисел от 1 до 15: " + mult);

                            // task2

        System.out.println("\n---------task2----------");

        int i = 1;
        while (i < 11) {
            System.out.println("Task" + i++);
        }

                        // task3 & Task 3.1

        System.out.println("\n---------task3 & Task 3.1----------");

         int j = 1;
         int c = 1;

        System.out.println ("Числа, которые делятся на 5: ");
        while (j <= 100 & c<=7 ) {

            if (j % 5 == 0) {
                System.out.print(j + ", ");
                j++;
                c++;
            } else {
                j++;
            }
        }
                            // task6

        System.out.println("\n---------task6----------");

        Random random = new Random();
        int l = random.nextInt(11) + 5;

        int[] array = new int[l];
        i = 0;
        System.out.print("[");
        while (i < l) {
            array[i] = random.nextInt(101) - 50;

            System.out.print(array[i] +  ", " );
            i++;
        }
        System.out.println("]");

        int min = array[0];
        int max = array[0];
        int sum = 0;

        i = 0;
        while (i < l) {
            sum += array[i];
            if (array[i] < min) min = array[i];

            if (array[i] > max) max = array[i];

            i++;
        }

        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее арифметическое: " + sum / l);

                                // task7

        System.out.println("\n---------task7----------");
        int[] arr = { 5, 6, -25, 0, 31, -15 };

        int maxi = arr[0];
        int minim = arr[0];

        int maxIn = 0;
        int minIn = 0;
        i = 0;
        while (i < arr.length) {

            if (arr[i] < minim) {
                minim = arr[i];
                minIn = i;
            }

            if (arr[i] > maxi) {
                maxi = arr[i];
                maxIn = i;
            }

            i++;
        }

        System.out.println("Минимальное значение = " + minim);
        System.out.println("Максимальное значение = " + maxi);

        arr[minIn] = minim;
        arr[maxIn] = maxi;

        i = 0;
        while (i < arr.length) {
            System.out.print(arr[i++] + ", ");
        }

    }
}
