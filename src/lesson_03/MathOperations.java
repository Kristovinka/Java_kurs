package lesson_03;

public class MathOperations {
    public static void main(String[] args) {
        // Ctrl D скопировать строку
        // Ctrl Y удалить строку
        // Ctrl + Shift + стрелка = перемецать строку

        int var1 = 20;
        int var2 = 7;

        int result;
        result = var1 + var2;
        System.out.println("Result: " + result);

        result = 15 + 6;
        System.out.println("Result: " + result);

        result = var1 + 5;
        System.out.println("Result: " + result);

        result = result + 5;
        System.out.println("Result: " + result);

        result = var1 - var2;
        System.out.println("Result: " + result);

        result = var1 * var2;
        System.out.println("Result: " + result);

        result = 1 + 2 * 2;
        System.out.println("Result 1 + 2 * 2 : " + result);

        result = var1 / var2;
        System.out.println("Result: " + result);

        System.out.println("Result 4 / 2 : " + (4 / 2));
        System.out.println("Result 4 % 2 : " + (4 % 2));

        System.out.println("Result 5 / 10 : " + (5 / 10));
        System.out.println("Result 5 % 10 : " + (5 % 10));

        double doubleVar1 = 20.0;
        double doubleVar2 = 7.0;
        double resultD = doubleVar1 / doubleVar2;
        System.out.println("ResultD : " + resultD);

    }
}
