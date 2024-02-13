package programmer.zaman.now.application;

import programmer.zaman.now.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Cecep");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for(var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobby");
    }
}
