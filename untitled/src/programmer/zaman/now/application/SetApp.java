package programmer.zaman.now.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Cecep");
        names.add("Wahyu");
        names.add("Cahyana");
        names.add("Asep");
        names.add("Kinan");
        names.add("Adam");

        System.out.println("HashSet");
        for(var name : names) {
            System.out.println(name);
        }

        Set<String> jeneng = new LinkedHashSet<>();
        jeneng.add("1. Cecep");
        jeneng.add("2. Wahyu");
        jeneng.add("3. Cahyana");
        jeneng.add("4. Asep");
        jeneng.add("5. Kinan");
        jeneng.add("6. Adam");

        for(var jenenge : jeneng) {
            System.out.println(jenenge);
        }

    }
}
