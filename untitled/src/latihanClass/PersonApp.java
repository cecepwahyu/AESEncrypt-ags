package latihanClass;

public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Eko", "Subang");

        var person2 = new Person("Wahyu");

        var person3 = new Person();

        System.out.println(person1);
        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

//        person1.sayHello("Ilham");
//        person2.sayHello("Rizky");
//        person3.sayHello("Cecep");
    }
}
