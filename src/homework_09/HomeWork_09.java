package homework_09;
//import java.util.stream;
import java.util.Scanner;

public class HomeWork_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------Task 0-------------- ");
        System.out.println("Введите строку: ");
        String str = scanner.nextLine();

        printString(str);

        System.out.println("-----------Task 1-------------- ");
        int[] array = {1, 4, 3, 6, 7};

        printArray(array);

        int index = 2;
        printArray(array, index);

        boolean flag = true;
        printArray(array, flag);
        flag = false;
        printArray(array, flag);


        System.out.println("-----------Task 2-------------- ");

        System.out.println("Введите степень для 2: ");
        int con  = scanner.nextInt();
        printconst(con);

        System.out.println("-----------Task 5-------------- ");
        String[] arr5 = { "One", "Two", "Twenty" };

        Task5(arr5);

    }
    public static void printString(String str) {

        System.out.println("Длина строки: " + str.length());
    }

    public static void printArray(int[] arr) {

        System.out.print("[");
        for ( int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + ((i != 0 ) ? ", " : "]\n"));
        }
        }

    public static void printArray(int[] arr, int x) {

        System.out.print("[");
        int i = 0;
        while (i < x) {
            System.out.print(arr[i] + ", ");
            i++;
        }
        i = arr.length - 1;
        while (i >= x) {
            System.out.print(arr[i] + (i != x ? ", " : "]\n"));
            i--;
        }

    }
    public static void printArray(int[] arr, boolean f) {
        if (f) {
            printArray(arr);
        }
        else {
            System.out.print("массив в обычном порядке ");
            System.out.print("[");
            int i = 0;
            while (i < arr.length) {
                System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "]\n"));
                i++;
            }
    }
    }
    public static void printconst(int k) {
   switch (k) {
       case 0 :{
           System.out.print("число = 1");
           break;
       }
       case 1 :{
           System.out.print("число = " + 2);
           break;
       }
       default:{
           if (k > 1) {
               int result = 1;
               for (int i = 0; i < k; i++) {
                   result = result * 2;
               }
               System.out.println("число = " + result);
           }
           else {
               k = k * -1;
               double resultmin = 1;
               for (int i = 0; i < k; i++) {
                   resultmin = resultmin / 2;
               }
                   System.out.println("число = " + resultmin);


           break;}
       }
   }
   }
    public static void Task5(String[] arr) {
        int i = 0;
        String max = arr[0];
        System.out.print("{");
        while (i < arr.length) {
            if (max.length() < arr[i].length()){
                max = arr[i];
            }
            System.out.print(arr[i] + ((i < arr.length - 1) ? ", " : "}\n"));
            i++;}

        char[] maxchars = max.toCharArray();
        i = 0;
        while (i < maxchars.length) {
            System.out.println(maxchars[i]);
            i ++;
        }
  }
}


