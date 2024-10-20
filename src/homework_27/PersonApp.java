package homework_27;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("fei@lhh.com", "password");
        System.out.println(person);

        person.setPassword("djdjqhf");
        person.setEmail("djdjqhf");
        System.out.println(person);

        person.setPassword("sakla@gmail.com");
        person.setEmail("Aaa5a-hj");
        System.out.println(person);



    }
}
