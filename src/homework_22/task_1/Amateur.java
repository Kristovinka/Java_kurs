package homework_22.task_1;

public class Amateur extends Human{

    @Override
    public void run() {
        System.out.println("\nспортсмен-любитель бежит со скоростью: " + (speed+5));
        time();
    }

    @Override
    public void time() {
        System.out.println("количество минут, необходимых для отдыха : " + (rest-5));
    }
}
