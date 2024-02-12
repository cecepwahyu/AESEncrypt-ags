package programmer.zaman.now.classes;

import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Angka pertama : ");
        Integer angka1 = scanner.nextInt();

        System.out.print("Angka kedua : ");
        Integer angka2 = scanner.nextInt();;

        Integer hasil = angka1 * angka2;

        System.out.println("Hasil penjumlahan " + hasil);

    }

}
