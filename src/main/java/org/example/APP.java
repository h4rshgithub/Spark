package org.example;

public class APP {
    public static void main(String[] args) {
        Student s= new Student(new JavaFullStack()); // Constrctor DI


//        Course c = new DSA();
//        s.setCourse(c); // setter DI manual


        s.study();
    }
}
