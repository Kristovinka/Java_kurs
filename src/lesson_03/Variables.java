package lesson_03;

public class Variables {
    public static void main(String[] args) {
        int myFirstVariable;
        myFirstVariable = 1;

        int mySecondVariable = 25;
        System.out.println(mySecondVariable);

        mySecondVariable = 50;
        System.out.println("Значение преременной: " + mySecondVariable);

        // byte, long, short

        byte byteVariable = 125;
        byteVariable = 45;
        System.out.println("Значение преременной byteVariable: " + byteVariable);

        short shortVar;
        shortVar = 31000;
        System.out.println("Short value: " + shortVar);

        long longVar = 2_100_000_000_000_000_000L;
        // L в концечисла указывает на long
        System.out.println("long variable: " + longVar);

        double doubleVar = 10.5421;
        System.out.println("Double variable: " + doubleVar);

        float floatVar = 11.65F; // F в концечисла указывает на float
        System.out.println("Float variable: " + floatVar);
    }
}
