package homework_27;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("fei@lhh.com", "password");
        System.out.println(person);

        person.setPassword("djdjqhf");
        person.setEmail(".g,mrmkj");
        System.out.println(person);

        person.setPassword("sakla@gmail.com");
        person.setEmail("A1a5a-hj43");
        System.out.println(person);



    }
}
