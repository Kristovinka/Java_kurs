package homework_27;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("fei@lhh.com", "password");
        System.out.println(person);

        person.setEmail(".g,mrmkj");
        person.setPassword("djFj-=0qhf");
        System.out.println(person);

        person.setEmail("sakla@gmail.com");
        person.setPassword("A1a5a-hj43");
        System.out.println(person);



    }
}
