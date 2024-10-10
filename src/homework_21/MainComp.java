package homework_21;

public class MainComp {
    public static void main(String[] args) {
        Storage storage = new Storage("dg46");
        Computer computer = new Computer(storage);

        System.out.println(computer.toString());
    }
}
