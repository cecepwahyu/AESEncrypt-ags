package programmer.zaman.now.application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        //List<String> strings = new LinkedList<>();

        strings.add("Cecep");
        strings.add("Wahyu");
        strings.add("Cahyana");
        strings.addAll(List.of("1", "2", "3"));

        System.out.println(strings);

        strings.set(0, "Eko");

        strings.remove(1);
        System.out.println(strings.get(0));
        System.out.println(strings);
    }
}
