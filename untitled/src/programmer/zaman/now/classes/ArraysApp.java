package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        String[] array1 = {"Cecep", "Wahyu", "Cahyana"};
        String[] array2 = {"Cecep", "Wahyu", "Cahyana"};

        Integer[] deret1 = {
                23,42,12,5,43,45,87,56,23,100
        };

        Arrays.sort(deret1);
        Arrays.sort(array1);
        System.out.println(Arrays.toString(deret1));
        System.out.println(Arrays.toString(array1));
        Integer[] array3 = Arrays.copyOf(deret1, deret1.length);
        System.out.println("Array 3 baru bernilai = " + Arrays.toString(array3));

        Boolean perbandingan = Arrays.equals(deret1, array3);
        System.out.println(perbandingan);

        System.out.println(Arrays.binarySearch(deret1, 23));
        System.out.println(Arrays.binarySearch(deret1, 100));

        Integer[] array4 = Arrays.copyOf(deret1, 5);
        System.out.println(Arrays.toString(array4));

        Integer[] array5 = Arrays.copyOfRange(deret1, 5, 10);
        System.out.println(Arrays.toString(array5));
    }
}
