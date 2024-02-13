package programmer.zaman.now.application;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        SortedMap<String, String> sortedMap = new TreeMap<>();

        sortedMap.put("Cecep", "Cecep");
        sortedMap.put("Wahyu", "Wahyu");
        sortedMap.put("Cahyana", "Cahyana");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

    }
}
