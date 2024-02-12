package programmer.zaman.now.classes;

public class StringApp {
    public static void main(String[] args) {

        String name = "Cecep Wahyu Cahyana";
        String nama = "Cahyana,Wahyu,Cecep";
        String nameLower = name.toLowerCase();
        String nameUpper = name.toUpperCase();
        String nameReplace = name.replace("Cahyana", "Cahyono");
//        Int value1 = 100;
//        Int valueToString = value1.toString();

        System.out.println(name);
        System.out.println(nameLower);
        System.out.println(nameUpper);
        System.out.println(nameReplace);

        String [] names = name.split(" ");
        for(var value : names) {
            System.out.println(value);
        }

        String[] namas = nama.split(",");
        for(var value : namas) {
            System.out.println(value);
        }
    }
}
