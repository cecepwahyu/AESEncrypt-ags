package programmer.zaman.now.application;

import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new java.util.LinkedHashMap<>();

        map.put("first", "Cecep");
        map.put("last", "Wahyu");
        map.put("middle", "Cahyana");

        Set<String> keys = map.keySet();
        for(var key : keys) {
            System.out.println(key);
        }
    }
}
