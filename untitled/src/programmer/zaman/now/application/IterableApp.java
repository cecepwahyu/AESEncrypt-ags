package programmer.zaman.now.application;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Cecep", "Wahyu", "Cahyana");

        for(var name : names) {
            System.out.println(name);
        }

    }
}
