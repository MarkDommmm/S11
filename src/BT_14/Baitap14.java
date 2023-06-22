package BT_14;

import java.util.Stack;

public class Baitap14 {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeNumber(String input) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int number = Character.getNumericValue(c);
                stack.push(number);
            }
        }
        while (!stack.isEmpty()) {
            int number = stack.pop();
            if (!isPrime(number)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "mot hai";
        String input2 = "12345";
        System.out.println(input1 + " là dãy số nguyên tố: " + isPrimeNumber(input1));
        System.out.println(input2 + " là dãy số nguyên tố: " + isPrimeNumber(input2));
    }
}
