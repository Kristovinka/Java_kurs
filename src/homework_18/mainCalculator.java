package homework_18;

import java.util.Scanner;

public class mainCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num1 = getInt();
        int num2 = getInt();
        //Тут мог быть switch с проверкой на знак, но уже поздно и хочется спать (
        System.out.println("сложение: " + Calculator.addition(num1,num2));
        System.out.println("вычитание: " + Calculator.subtraction(num1,num2));

        System.out.println("умножение: " + Calculator.multiplication(num1,num2));
        System.out.println("деление: " + Calculator.division(num1,num2) + "," + num1%num2);

        System.out.println("\n Вычисление длины окружности и площади круга: \n принимаю радиус");
        int radius = getInt();
        System.out.println(" Длина окружности : " + Calculator.circumference(radius) );
        System.out.println(" Площадь круга: " + Calculator.areaCircle(radius) );

    }

    public static int getInt() {
        System.out.println("Введите число:");

        int num;
        if (scanner.hasNextInt()) {

            num = scanner.nextInt();
        } else {

            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия

            num = getInt();
        }
        return num;
    }
}