package homework_10;

import java.math.BigInteger;
import java.util.Arrays;

//Написать метод, принимающий на вход массив целых чисел.
    //Метод должен вернуть массив, состоящий только из простых чисел,
    //присутствующих в изначальном массиве
    //вход -> {0, 13, -25, 11, 31, 55, 98, 11, 5} -> выход {13, 11, 31, 11, 5}
public class Task_3 {
        public static void main(String[] args) {

            int[] array = {0, 13, -25, 11, 31, 55, 98, 11, 5};
            System.out.println("Исходный массив: " + Arrays.toString(array));
            int[] array2 = metod(array);
            System.out.println("Новый массив: " + Arrays.toString(array2));

        }

        public static int[] metod(int[] array) {
            int i = 0;
            Integer integer;
            BigInteger bigInteger;
            boolean probablePrime;
            int count = 0;

            while (i < array.length){
                integer = array[i];
                bigInteger = BigInteger.valueOf(integer);
                probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));

                if (probablePrime & integer > 0) count ++;
               // System.out.println(probablePrime);System.out.println(count);
                i ++;
            }
            i = 0;
            int j = 0;
            int[] array2 = new int[count];
            while (i < array.length){
                integer = array[i];
                bigInteger = BigInteger.valueOf(integer);
                probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
                if (probablePrime & integer > 0) {
                    array2[j] = array[i];
                    j ++;
                }
                i ++;
            }

        return array2;
        }
}
