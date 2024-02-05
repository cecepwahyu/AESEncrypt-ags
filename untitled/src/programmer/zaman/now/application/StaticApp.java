package programmer.zaman.now.application.application;

import programmer.zaman.now.data.Application;
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println("Test Static App");
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5,6,7));

        Country.City city = new Country.City();
        city.setName("Jogja");

        System.out.println(city.getName());

        System.out.println(Application.PROCESSORS);
    }
}
