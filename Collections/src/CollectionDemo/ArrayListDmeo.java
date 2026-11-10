package CollectionDemo;

import java.util.*;
public class ArrayListDmeo {
     static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(10);
        arr.add(20);
        arr.add(10);
        arr.add(20);
        System.out.println(arr);
//        System.out.println(arr.get(3));
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
           int data = it.next();
           if(data ==20){
              it.remove();
           }else {
              System.out.println(data);
           }

        }


     }
}
