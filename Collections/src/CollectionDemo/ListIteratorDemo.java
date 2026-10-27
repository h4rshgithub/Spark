package CollectionDemo;

import java.util.*;

public class ListIteratorDemo {
    static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java" , "Node" , "React", "Python"));
        ListIterator<String> it = list.listIterator();
        System.out.println("fowrard direction ---->");
        while(it.hasNext()){
            String data =it.next();
            System.out.println(data);
            if(data.equals("Python")){
                it.set("Java");
            }

        }
        System.out.println("<------Backward Direction ");
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println(list);
    }
}
