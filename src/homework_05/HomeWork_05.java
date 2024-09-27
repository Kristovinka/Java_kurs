package homework_05;

import java.util.Scanner;

public class HomeWork_05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи ваше имя: ");
        String name = scanner.nextLine();
        System.out.println(name.length());

        char firstChar = name.charAt(0);
        char lastChar = name.charAt(name.length() - 1);

        int  firstint = (int)firstChar;
        System.out.println("Первый символ имени: " + firstint);

        int lastInt = (int)lastChar;
        System.out.println("Последний символ имени: " + lastInt);

        // Task2
        System.out.println("--------Task 2---------");

        String string1 = "Java";
        String string2 = "is";
        String string3 = "a";
        String string4 = "powerful";
        String string5 = "language";

        String concatStr1 = string1 + " "  + string2 + " "  + string3 + " "  + string4 + " "  + string5;
        System.out.println("concatStr: " + concatStr1);

        String concatStr2 = string1.concat(" ").concat(string2).concat(" ").concat(string3).concat(" ").concat(string4).concat(" ").concat(string5); // (str1 + str2) + str3 + "!"
        System.out.println("concatStr2: " + concatStr2 );
        System.out.println("length: " + concatStr2.length());
    }
}
