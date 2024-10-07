package homework_17;

public class Employee {

    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (age < 15 || age > 70) return;
        this.age = age;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public void setSalary(double salary) {
        if (age < 0 || age > 70000) return;
        this.salary = salary;

        }
    public String toString() {
        return String.format("Person: %s, Age: %d, Salary: %s", this.name, this.age, this.salary);
    }
    public void info() {
        System.out.println(toString());
    }
}
