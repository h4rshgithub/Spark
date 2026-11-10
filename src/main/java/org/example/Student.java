package org.example;

public class Student {
    public  Student(){

    }

    private Course course; // NUll pointer exception
    //setter Dependency injection
    public void setCourse(Course course) {
        this.course = course;
    }

    //Construxtor DI

    public Student(Course course) {
        this.course = course;
    }

    public void study(){
        int start = course.eroll();
        if(start >=1){
            System.out.println("Journey Started ");
        }else{
            System.out.println("Payment Failed");
        }
    }
}
