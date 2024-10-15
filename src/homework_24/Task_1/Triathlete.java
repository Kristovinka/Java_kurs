package homework_24.Task_1;

public class Triathlete implements Runner, Swimmer{

    @Override
    public void run() {
        System.out.println("Triathlete run");
    }

    @Override
    public void swim() {
        System.out.println("Triathlete swim");
    }
}
