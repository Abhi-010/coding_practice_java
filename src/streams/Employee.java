package streams;

import java.util.Objects;

public class Employee {
    private String name ;
    private int salary ;
    private int age ;
    private int phone_number ;

    public Employee(int age, String name, int phone_number, int salary) {
        this.age = age;
        this.name = name;
        this.phone_number = phone_number;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return getSalary() == employee.getSalary() && getAge() == employee.getAge() && getPhone_number() == employee.getPhone_number() && Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(getName());
        result = 31 * result + getSalary();
        result = 31 * result + getAge();
        result = 31 * result + getPhone_number();
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", phone_number=" + phone_number +
                '}';
    }
}
