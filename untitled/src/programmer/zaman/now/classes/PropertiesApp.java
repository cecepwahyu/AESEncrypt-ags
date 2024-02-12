package programmer.zaman.now.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) throws FileNotFoundException {

        //HOW TO GET DATA FROM PROPERTIES

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!");
        } catch (IOException e) {
            System.out.println("Gagal load data dari file!");
        }


        //HOW TO STORE DATA TO PROPERTIES

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Cecep");
            properties.put("name.middle", "Wahyu");
            properties.put("name.last", "Cahyana");

            properties.store(new FileOutputStream("name.properties"), "");
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan!");
        } catch (IOException e) {
            System.out.println("File tidak dapat di store!");
        }

    }
}
