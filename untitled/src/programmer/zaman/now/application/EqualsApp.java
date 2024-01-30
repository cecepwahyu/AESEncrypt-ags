package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        //Entity 1
        String first = "Cecep";
        first = first + " " + "Wahyu";

        System.out.println(first);
        //Entity 2
        String second = "Cecep Wahyu";
        System.out.println(second);

        System.out.println(first == second);

        System.out.println(first.equals(second));


        //====================================================
        // TEST 2
        //Entity 1

        Integer firstInt = 1000;
        firstInt = firstInt + 2000;

        System.out.println(firstInt);

        Integer secondInt = 3000;
        System.out.println(secondInt == firstInt);
        System.out.println(secondInt.equals(firstInt));

        System.out.println("BATAS TEST 2");
        System.out.println(first == first);
        System.out.println(secondInt == secondInt);

        System.out.println(secondInt.equals(secondInt));
        System.out.println(first.equals(first));

        String third = "Cecep Wahyu";

        System.out.println(second == third);
        System.out.println(second.equals(third));

        Integer testInt = 1000;
        String testStr = "1000";

        System.out.println("TESTING STRING CONVERT");
        System.out.println(testInt.equals(testStr));
        System.out.println(testStr.equals(testInt.toString()));
        System.out.println(testInt.equals(Integer.parseInt(testStr)));
    }
}
