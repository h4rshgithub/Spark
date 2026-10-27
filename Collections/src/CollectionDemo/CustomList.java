package CollectionDemo;

import java.util.ArrayList;
import java.util.List;

class Student{
    String name ;
    String course;
    int id;

    public Student(String name, String course, int id) {
        this.name = name;
        this.course = course;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", id=" + id +
                '}';
    }
}
public class CustomList {
    public static void main(String[] args) {
        Student s1 = new Student("harsh" , "java" , 1);
        Student s2 = new Student("Nikis " , "React" , 2);
        Student s3 = new Student("shivam " , "Node" , 3);
        List<Student> stulist = new ArrayList<>();
        stulist.add(s1);
        stulist.add(s2);
        stulist.add(s3);
        System.out.println(stulist);


    }
}
