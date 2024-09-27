package homework_10;
import java.util.Arrays;
import java.util.Scanner;
        //Написать метод, принимающий на вход массив строк. Метод должен вернуть массив,
        //состоящий из самой короткой и
        //самой длинной строки изначального массива.
public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите длину массива: ");
        int len  = scanner.nextInt();
        scanner.nextLine();
        if (len <= 0) {
            System.out.println( len + " использовать нельзя! ");
            return ;
        }
        else {
            String[] array = new String[len];
            int i = 0;
            while (i < array.length) {
                System.out.println("Введите " + (i+1) + " строкy массива: ");
                array[i]  = scanner.nextLine();
                //System.out.print(array [i] + ((i < array.length - 1) ? ", " : "]\n"));
                i++;
            }
            System.out.println("Новый массив: " + Arrays.toString(newArr(array)));

        }
        }
        public static String[] newArr (String[] array){
            int i = 0;
            String max = array[0];
            String min = array[0];
            while (i < array.length) {
                if (max.length() < array[i].length()){
                    max = array[i];
                }
                if (min.length() > array[i].length()){
                    min = array[i];
                }
                i++;
            }
            String[] newArray = new String[2];
            newArray[0] = min;
            newArray[1] = max;
        return newArray;
        }
    }

