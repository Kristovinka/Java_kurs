package lesson_22.sticPoly;

public class ZooApp {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.voice();
        System.out.println(cat.toString());
        cat.eat();

        System.out.println("------------------");
        Dog dog = new Dog();
        System.out.println(dog.toString());
        dog.voice();
        System.out.println("------------------");

        Hamster hamster = new Hamster();
        System.out.println(hamster.toString());
        hamster.voice();

        System.out.println("------------------");
        Test test = new Test();
        System.out.println(test.toString());

        System.out.println(test);

    }


}
