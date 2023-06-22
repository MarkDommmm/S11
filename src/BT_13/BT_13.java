package BT_13;

import java.util.Scanner;
import java.util.Stack;

public class BT_13 {
    public static boolean isDecreasing(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean flag = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > stack.peek()) {
                flag = true;
                break;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        String input1 = "4321";
        String input2 = "123";

        System.out.println(input1 + " Day giam dan: " + isDecreasing(input1));
        System.out.println(input2 + " Day giam dan: " + isDecreasing(input2));
    }
}
