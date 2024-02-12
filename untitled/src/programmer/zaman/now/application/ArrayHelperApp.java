package programmer.zaman.now.application;

import programmer.zaman.now.util.ArrayHelper;

public class ArrayHelperApp {
    public static void main(String[] args) {

        String[] names = {"Cecep", "Wahyu", "Cahyana"};
        Integer[] numbers = {23, 42, 12, 5, 43, 45, 87, 56, 23, 100};

        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.count(numbers)
        );

    }
}
