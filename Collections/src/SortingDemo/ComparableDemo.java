package SortingDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    static void main(String[] args) {
        List<StudentDemo> arr = new ArrayList<>();
        StudentDemo s1 = new StudentDemo(22 , "harsh");
        StudentDemo s2 = new StudentDemo(1 , "niki");
        StudentDemo s3 = new StudentDemo(4, "proo");
        StudentDemo s4 = new StudentDemo(2 , "tung tung ");

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
//        System.out.println(arr);
//        Collections.sort(arr);
//        System.out.println(arr);


        List<EmployeeDemo> list = new ArrayList<>();
        EmployeeDemo e1 = new EmployeeDemo(22 , "harsh" , 211);
        EmployeeDemo e2 = new EmployeeDemo(1 , "niki" , 212);
        EmployeeDemo e3 = new EmployeeDemo(4, "proo" ,213);
        EmployeeDemo e4 = new EmployeeDemo(2 , "tung tung ",210);

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println(list);
        Collections.sort(list , new EmployeeDemo());
        System.out.println(list);
        System.out.println();
    }
}
