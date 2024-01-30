package BasicJava;

public class RecursiveMethod2 {
    public static void main(String[] args) {
        System.out.println(factorialRecursive(8));
    }

    /*
    *s
    *
    * ss
    * s
    * s
    * ss
    *
     */
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value-1);
        }
    }

}
