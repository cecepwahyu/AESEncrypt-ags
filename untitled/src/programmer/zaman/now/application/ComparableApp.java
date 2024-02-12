package programmer.zaman.now.application;

import programmer.zaman.now.util.Person;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Cecep", "Indonesia"),
                new Person("Eko", "Indonesia"),
                new Person("Kurniawan", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
