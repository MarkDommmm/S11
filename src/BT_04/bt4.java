package BT_04;

import java.util.Scanner;
import java.util.Stack;

public class bt4 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        System.out.println("Nhập vào một chuỗi cần đảo ngược");
        String str = new Scanner(System.in).nextLine();

        String word[]  = str.split(" ");

        for(int i = 0; i < word.length; i++) {
            stack.push(word[i]);
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }

}
