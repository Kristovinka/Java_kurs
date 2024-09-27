package homework_07;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_07 {
    public static void main(String[] args) {

                //Task 1
    System.out.println("----------Task 1------------ \n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1, 2 или 3: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number) {
            case 1:
                System.out.println("number равен Один");
                break;
            case 2:
                System.out.println("number равен Два");
                break;
            case 3:
                System.out.println("number равен Три ");
                break;
            default:
                System.out.println("switch: что-то другое");
        }

        //Task 2

        System.out.println("----------Task 2------------ \n");
        Random random = new Random();
        int v1 = random.nextInt(101);
        int v2 = random.nextInt(101);
        int v3 = random.nextInt(101);
        int v4 = random.nextInt(101);

        System.out.println("Output: " + v1 + " , " + v2 + " , " + v4);

        int max = v1;
        if (v2 > max) {
            max = v2;
        }
        if (v4 > max) max = v4;

        System.out.println("Максимальное число: " + max);

                       // Task 4

        System.out.println("----------Task 4------------ \n");

        System.out.println("Введите число от 1 до 7: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        switch (num) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг ");
                break;
            case 5:
                System.out.println("Пятница ");
                break;
            case (6|7):
                System.out.println("Выходной!!!");
                break;
            /*case (7):
                System.out.println("Выходной!!!");
                break;*/

            default:
                System.out.println("switch: что-то другое");
        }
    }
}
