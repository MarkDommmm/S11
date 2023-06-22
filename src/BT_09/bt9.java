package BT_09;

import java.util.Scanner;
import java.util.Stack;

public class bt9 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Nhập chuỗi");
        Integer str = new Scanner(System.in).nextInt();
        String str2 = str.toString();
        Stack<Character> stack1 = new Stack<>();

        for (int i = 0; i < str2.length(); i++) {
            stack1.push(str2.charAt(i));

        }
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop());
        }
    }
}
