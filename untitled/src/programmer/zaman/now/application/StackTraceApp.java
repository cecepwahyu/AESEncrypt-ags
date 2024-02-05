package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {

       try {
           sampleError();
       } catch (RuntimeException e) {
           e.printStackTrace();
       }
    }

    public static void sampleError() {
        try {
            String[] names = {
                    "Cecep", "Wahyu", "Cahyana"
            };

            String[] age = {
                    "11", "12"
            };

            System.out.println(names[100]);
            System.out.println(age[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
