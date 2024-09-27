package homework_11;
import java.util.Scanner;
public class HomeWork_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len  = scanner.nextInt();
        int[] array = new int [len];

        scanArray(array);
        printArray(array);
        int summa = sumArray(array);
        System.out.println( "Cуммa всех элементов в массиве " + summa);

        ////// task 2

        System.out.println( "----------Task 2----------- " );
        arithArray(array, summa);

}
//////////////////////////////////////////////////////////
    public static int[] scanArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите " + (i+1) + " элемент массива: ");
            arr[i]  = scanner.nextInt();
            //System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));
            i++;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("массив : ");
        System.out.print("[");
       int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));
            i++;

        }
    }

    public static int sumArray(int[] arr) {
        int i = 0;
        int sum = 0;
        while (i < arr.length) {

           sum += arr[i] ;
            i++;
        }
        return sum;
    }
    public static void arithArray(int[] arr, int sum) {
        int arith = 0;

        arith = sum / arr.length;

        System.out.println( "Cреднее значение всех элементов в массиве: " + arith +
                "," + sum % arr.length);


    }
    }

