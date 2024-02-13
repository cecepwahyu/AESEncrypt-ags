package programmer.zaman.now.application;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        //Queue<String> queue = new ArrayDeque<>();
        //Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new LinkedList<>();

//        for(int i = 0; i < 25; i++) {
//            queue.add(String.valueOf(i));
//        }
        queue.add("Cecep");
        queue.add("Wahyu");
        queue.add("Cahyana");
        queue.add("Asep");
        queue.add("Kinan");
        queue.add("Adam");
        System.out.println(queue.size());

        for (String next = queue.poll(); next != null; next = queue.poll()) {
            System.out.println(next);
            if(next.equals("Ilham")) {
                return;
            }
        }

        System.out.println(queue.size());
    }
}
