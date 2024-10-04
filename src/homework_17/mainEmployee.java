package homework_17;

public class mainEmployee {
    public static void main(String[] args) {
        Employee person1 = new Employee();
        person1.setAge(43);
        person1.setSalary(3900.50);
        person1.setName("Ivan");

        person1.info();
    }
}
