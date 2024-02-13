package programmer.zaman.now.application;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        //MAP
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Cecep");
        map.put("name.middle", "Wahyu");
        map.put("name.last", "Cahyana");

        System.out.println(map.get("name.first"));

        //WeakHashMap

    }
}
