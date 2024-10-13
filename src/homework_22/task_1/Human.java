package homework_22.task_1;

public class Human {
    protected static int speed = 10;
    protected static int rest = 15;

    public int getSpeed() {
        return speed;
    }

    public int getRest() {
        return rest;
    }

    public void run(){
        System.out.println("\nчеловек бежит со скоростью: " + speed);
        time();
    }
    public void time(){
        System.out.println("количество минут, необходимых для отдыха : " + rest);
    }
}
