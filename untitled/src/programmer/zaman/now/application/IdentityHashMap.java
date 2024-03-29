package programmer.zaman.now.application;

import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new java.util.IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

    }
}
