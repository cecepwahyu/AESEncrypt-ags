package programmer.zaman.now.application;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Cecep", "Cecep");
        map.put("Wahyu", "Wahyu");
        map.put("Cahyana", "Cahyana");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Cecep"));
        System.out.println(map.higherKey("Cecep"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }
    }
}
