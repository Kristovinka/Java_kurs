package homework_15;

public class Husband {
    String name;
    String profession;
    int age;
    boolean actualStatus;


    public Husband (String name, String profession, int age){
        this.name = name;
        this.profession = profession;
        this.age = age;
    }

    public boolean changeStatus(boolean change){
        if (change)
        System.out.println("Нынешний");

         else System.out.println("Бывший");
        actualStatus = change;
        return actualStatus;
    }

    public void mobility(){
        System.out.println("Я еду!");
    }
}
