package SortingDemo;

import java.util.Comparator;

public class EmployeeDemo implements Comparator {
    int id ;
    String name ;
    int dept;

    public EmployeeDemo(int id, String name, int dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public EmployeeDemo() {
    }

    @Override
    public int compare(Object o1, Object o2) {
         EmployeeDemo e1 = (EmployeeDemo) o1;
        EmployeeDemo e2 = (EmployeeDemo) o2;
        return e1.id - e2.id;

    }

    @Override
    public String toString() {
        return "EmployeeDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }
}
