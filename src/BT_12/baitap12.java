package BT_12;

import java.util.LinkedList;
import java.util.Queue;

public class baitap12 {
    public static int findMinElement(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            queue.offer(arr[i]);
        }

        int minElement = queue.poll();

        while (!queue.isEmpty()) {
            int currentElement = queue.poll();

            if (currentElement < minElement) {
                queue.offer(minElement);
                minElement = currentElement;
            } else {
                queue.offer(currentElement);
            }
        }

        return minElement;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 12, 3};
        int minElement = findMinElement(arr);
        System.out.println("Phần tử nhỏ nhất " + minElement);

    }
}
