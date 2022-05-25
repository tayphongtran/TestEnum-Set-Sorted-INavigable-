package sorted.set;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Employee implements Comparable<Employee> {
    private String name;
    private float salary;

    public Employee() {

    }

    public Employee(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        float delta = this.getSalary() - o.getSalary();
        if (delta > 0){
            return 1;
        }else if (delta < 0){
            return -1;
        }

        return this.name.compareTo(o.getName());
    }

}
