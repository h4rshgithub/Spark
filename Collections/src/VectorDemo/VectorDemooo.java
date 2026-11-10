package VectorDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemooo {
    static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        vec.add(10);
        vec.add(20);
        vec.add(30);
        Enumeration<Integer> e  = vec.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //same as ArrayList but it is as legacy class and is Thread safe cause methods are syncronized in Vector
    }
}
