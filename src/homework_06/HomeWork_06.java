package homework_06;

import java.util.Scanner;
import java.util.Random;

public class HomeWork_06 {
    public static void main(String[] args) {

        // Task 1

        System.out.println("----------Task 1------------ ");

        String str = "Programming is fun.";
        boolean contains = str.contains("fun");
        System.out.println("str.contains(\"fun\"): " + contains);

        // Task 2

        System.out.println("\n----------Task 2------------ ");
        Random random = new Random();

        int a = random.nextInt(51); // (0...х-1) -> (0...50) включительно
        int b = random.nextInt(101);
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        boolean b1 = a == b;
        System.out.println(a + " == " + b + " -> " + b1);

         b1 = a != b;
        System.out.println(a + " != " + b + " -> " + b1);

         b1 = a > b;
        System.out.println(a + " > " + b + " -> " + b1);

         b1 = b < a;
        System.out.println(b + " < " + a + " -> " + b1);

        // Task 3

        System.out.println("\n----------Task 3------------ ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int var = scanner.nextInt();
        scanner.nextLine();

        boolean b_1 = var % 2 == 0;
        boolean b_2 = var % 3 == 0;
        boolean b_3 = b1 && b_2;



        System.out.println("Число: " + var +  " \nчетное: " + b_1 +
                "; \nкратно 3: "+ b_2+ "; \nчетное и кратное 3: " + b_3);



        //Task 4

       /* Result1 = true   11 > 10
          Result2 = true   5 = 5
          Result3 = false  24 = 24
          Result4 = true   2 > = 2
          Result5 = false  2 = 2   */

    }
}
