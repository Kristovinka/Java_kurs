package lesson_28;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private String dateOfBirth;

    public Employee(String firstName, String lastName, String dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // link na odin i tot je obj
        if (!(obj instanceof Employee)) return false; // Proverka na vosmojnoct kasting v Employee
        Employee employee = (Employee) obj;

       // firstName.equals(employee.firstName);
       return Objects.equals(firstName,employee.firstName)&&
               Objects.equals(lastName,employee.lastName) &&
               Objects.equals(dateOfBirth,employee.dateOfBirth);
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstName, lastName, dateOfBirth);
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
