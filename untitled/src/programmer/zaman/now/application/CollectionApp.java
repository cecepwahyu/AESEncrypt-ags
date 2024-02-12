package programmer.zaman.now.application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Cecep");
        collection.add("Wahyu");
        collection.add("Cahyana");

        System.out.println(collection);

        collection.addAll(List.of("1", "2", "3"));
        System.out.println(collection);

        for(var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.size());
        System.out.println(collection.contains("Cecep"));
        System.out.println(collection.containsAll(List.of("1", "2", "3")));

        collection.remove("Cecep");
        collection.removeAll(List.of("1", "2", "3"));
        System.out.println(collection);

        System.out.println("AFTER REMOVE");
        for (var value : collection) {
            System.out.println(value);
        }
    }
}
