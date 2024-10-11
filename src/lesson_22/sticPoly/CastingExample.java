package lesson_22.sticPoly;

public class CastingExample {
    public static void main(String[] args) {

        Animal animal = new Cat(); // tip Cat preobrasuetca k tipu Animal

        animal.voice();

        Dog dog = new Dog();
        Animal animal2 = dog;

        Animal animal3 = new Hamster();

        Animal[] animals = new Animal[3];
        animals[0] = animal;
        animals[1] = animal2;
        animals[2] = animal3;

        for (int i = 0; i < animals.length; i ++){
            animals[i].voice();
        }

        int i1 = 100;
        double d1 = i1;

        System.out.println(d1);

        double y = 10.56;
        int x = (int) y ;

        Cat catLink;
        Animal animalLink = new Cat();
        //animalLink.eat(); nedoctupno
        catLink = (Cat) animalLink;
        catLink.eat();

        System.out.println("\n--------------");

        for (int i = 0; i < animals.length; i ++){
            System.out.println("sout:" + animals[i]);
            System.out.println(animals[i].getClass() + " instanceof Cat: "  + (animals[i] instanceof Cat));

            Animal current = animals[i];

            if(animals[i] instanceof Cat){
                System.out.println(i +" index besopasno k tip Cat");
                Cat teapCat = (Cat) current;
                teapCat.eat();}
        }
    }
}
