package programmer.zaman.now.application;

import java.util.Hashtable;
import java.util.Map;

public class HashtableApp {

    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Cecep", "Cecep");
        map.put("Otong", "Otong");
        map.put("Ucup", "Ucup");

        for(var key : map.keySet()){
            System.out.println(key);
        }

        for(var value : map.values()){
            System.out.println(value);
        }


    }

}
