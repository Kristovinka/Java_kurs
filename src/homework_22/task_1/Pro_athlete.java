package homework_22.task_1;

public class Pro_athlete extends Amateur{

    @Override
    public void run() {
        System.out.println("\nспортсмен-профи бежит со скоростью: " + (speed+15));
        time();
    }

    @Override
    public void time() {
        System.out.println("количество минут, необходимых для отдыха профи: " + (rest-10));
    }
}
