package com.revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionMap {

    public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Annuvibha");
    map.put(2, "Kajal");
    map.put(3, "Pooja");

//    String student = map.get(2);
//        System.out.prin tln(student);
//        System.out.println(map.containsKey(3));
//        System.out.println(map.containsValue("Golu"));

//    for(Map.Entry<Integer, String> e : map.entrySet()){
//        System.out.println(e.getKey());
//        System.out.println(e.getValue());
//    }

    Set<Integer> keys = map.keySet();
    for(Integer key : keys){
        System.out.println(key+ " " +map.get(key));
    }

    map.remove(1);
        System.out.println(map);
    }
}
