package programmer.zaman.now.classes;

import java.awt.*;

public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("JAVA"));

        System.gc();

        System.out.println("Hallo");
        System.exit(99);
        System.out.println("Hai");
    }
}
