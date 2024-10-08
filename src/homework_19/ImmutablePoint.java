package homework_19;

public class ImmutablePoint {
    private final int x, y;

    public final int MAX_USERS = 100;

        public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        //this.MAX_USERS = x + y; Ошибка компиляции, т.к. MAX_USERS final переменная
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setXY(int val, int valY) {

        // после инициализации переменной нельзя поменять значение переменной.
        //  И вообще для final переменных сеттер не пишется (ошибка компиляции)

        //   Для переменных примитивного типа это означает,
        //   что однажды присвоенное значение не может быть изменено
        // this.x = val;
        // this.y = valY;
    }

    public void change(){
       // this.MAX_USERS = 12; Ошибка компиляции, т.к. MAX_USERS final переменная
    }

    public void printMessage(final String message){

        System.out.println("message:  " + message);
        //message = "gggg";
        // переписать ссылку не могу, т.к. переменная final

//        Но можно изменить значение строки через Reflection API.
//        Либо можно попробовать преобразовав строку в массив и там уже изменить,
//        но так мы всё равно в конце забираем ссылку.

//        Возможно ещё где-то есть функция,
//        которая работает напрямую с массивом символов (нашей строкой)-_-

        char[] array = message.toCharArray();
        array[0] = 2;
        //   Так тоже нельзя
        //message = array.toString();
        System.out.println("message:  " + message);

    }
}
