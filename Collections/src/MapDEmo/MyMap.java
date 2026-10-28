package MapDEmo;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    static void main(String[] args) {
        Map<String , Integer> map = new HashMap<>();
        map.put("harsh" , 2);
        map.put("yoyo" , 3);
        map.put(null , 3);
        map.put(null ,4);

        if( map.containsKey("yoyo")){
            System.out.println(map.get("yoyo"));

        }
        for(String key : map.keySet()){
            System.out.println("Key :" + key+ " val :"+ map.get(key));
        }
        for( Integer val : map.values()){
            System.out.println("value :" + val);

        }
        for(Map.Entry<String , Integer> it : map.entrySet()){
            System.out.println("Key : " + it.getKey()+ ", Value : " + it.getValue());
        }

    }
}
