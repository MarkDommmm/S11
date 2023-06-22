package BT_11;

import java.util.Stack;

public class bt11 {
    public static int findMaxElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] > stack.peek()) {
                stack.push(arr[i]);
            }
        }

        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 12, 3,1,11,111,1111};
        int maxElement = findMaxElement(arr);

        if (maxElement != -1) {
            System.out.println("Phần tử lớn nhất: " + maxElement);
        } else {
            System.out.println("Array Rỗng");
        }

    }
}


