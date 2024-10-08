package homework_18;

import java.util.Scanner;


public class Calculator {

    public static final double PI = 3.141519;

    public static int addition(int val1, int val2) {

        int add = val1 + val2;
        return add;
    }
    public static int subtraction(int val1, int val2) {

        int sub = val1 - val2;
        return sub;
    }

  public static int multiplication(int val1, int val2) {
      int mul = val1 * val2;
      return mul;
    }

  public static int division(int val1, int val2) {
      int div = val1 / val2;
      return div;
    }

    public static double circumference(int radius) {

      return  PI * Math.pow(radius,2);
    }

    public static int areaCircle(int val1, int val2) {
      int div = val1 / val2;
      return div;
    }


}


