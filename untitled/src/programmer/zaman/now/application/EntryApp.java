package programmer.zaman.now.application;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Cecep", "Cecep Value");
        map.put("Wahyu", "Wahyu Value");
        map.put("Cahyana", "Cahyana Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for(var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
