package SortingDemo;

public class StudentDemo implements Comparable<StudentDemo> {
    int id;
    String name ;

    @Override
    public String toString() {
        return "StudentDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public StudentDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public int compareTo(StudentDemo o) {
        return this.id - o.id;
    }


}
