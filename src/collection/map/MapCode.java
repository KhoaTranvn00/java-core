package collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapCode {
    public static void main(String[] args) {
        Map<String, Integer> hashMap
            = new Hashtable<>();

        // Inserting pairs in above Map
        // using put() method
        hashMap.put("a", 100);
        hashMap.put("b", 200);
        hashMap.put("b", 300);
        hashMap.put("d", 400);

        for (Map.Entry<String, Integer> me : hashMap.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
