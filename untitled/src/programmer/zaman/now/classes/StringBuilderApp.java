package programmer.zaman.now.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        //old style

        String name = "Cecep";

        name = name + " " + "Wahyu";

        name = name + " " + "Cahyana";

        //System.out.println(name);

        //with StringBuilder

        StringBuilder builder = new StringBuilder();
        builder.append("Cecep");
        builder.append(" ");
        builder.append("Wahyu");
        builder.append(" ");
        builder.append("Cahyana");

        System.out.println(builder.toString());
    }
}
