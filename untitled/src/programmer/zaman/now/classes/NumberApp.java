package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        Double doubleValue = intValue.doubleValue();
        Long longValue = intValue.longValue();
        Short shortValue = intValue.shortValue();

        String contoh = "12000";
        System.out.println(contoh);

        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);

    }
}
