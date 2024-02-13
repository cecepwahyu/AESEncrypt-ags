package programmer.zaman.now.application;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Satu");

        Set<String> mutable = new HashSet<>();
        mutable.add("Cecep");
        mutable.add("Wahyu");
        //Set<String> set = Set.of("Cecep", "Wahyu", "Cahyana");
//        for (var setValue : set) {
//            System.out.println(setValue);
//        }

        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Cecep", "Wahyu", "Cahyana");

        //set.add("Eko"); // Error

    }
}
