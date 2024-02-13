package programmer.zaman.now.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Cecep");
        list.add("Otong");
        list.add("Ucup");
        list.add("Budi");
        list.add("Joko");
        list.add("Rudi");

        System.out.println("Sebelum di sorting :");
        for(var valueSebelum : list){
            System.out.println(valueSebelum);
        }

        Collections.sort(list);
        System.out.println("Setelah di sorting :");
        for(var valueSesudah : list){
            System.out.println(valueSesudah);
        }
    }
}
