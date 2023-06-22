package BT_01;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("hieu");
        queue.offer("hieu");
        queue.offer("hieu");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}