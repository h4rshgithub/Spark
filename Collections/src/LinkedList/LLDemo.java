package LinkedList;

import java.util.LinkedList;

public class LLDemo {
    static void main(String[] args) {
        LinkedList <String > ll = new LinkedList<>();
        ll.add("raj");
        ll.add("cghodu");
        ll.add("boss");
        ll.add("yash");

        String first = ll.getFirst();
        String last = ll.getLast();
        System.out.println("first : " + first+ " Last :" + last);


    }
}
