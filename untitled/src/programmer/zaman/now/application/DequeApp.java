package programmer.zaman.now.application;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Cecep");
        stack.offerLast("Wahyu");
        stack.offerLast("Cahyana");

//        System.out.println(stack.pollLast());
//        System.out.println(stack.pollLast());
//        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        Deque<String> queue = new LinkedList<>();

        stack.offerLast("Cecep");
        stack.offerLast("Wahyu");
        stack.offerLast("Cahyana");

        System.out.println(stack.pollFirst());

    }
}
