package programmer.zaman.now.classes;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {

        String value = "Cecep Wahyu Cahyana";

        StringTokenizer tokenizer = new StringTokenizer(value, " ");

        //with split
        for (var result : value.split(" ")) {
            System.out.println(result);
        }

        System.out.println(tokenizer.countTokens());

        //with tokenizer
        while (tokenizer.hasMoreTokens()) {
            String result = tokenizer.nextToken();
            System.out.println(result);
        }



    }
}
