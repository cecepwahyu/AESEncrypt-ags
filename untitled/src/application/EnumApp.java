package application;

import data.Customer;
import data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Cecep");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());
        System.out.println("Customer atas nama " + customer.getName() + " sudah mencapai level " + customer
                .getLevel());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        System.out.println("Print Level : ");

        for (var value: Level.values()) {
            System.out.println(value);
        }

    }
}
