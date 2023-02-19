package ExerciseStacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        int length = input.length() / 2;
        boolean isTrue = false;
        if (input.length() % 2 != 0) {
            isTrue = true;
        } else {
            for (int i = 0; i < length; i++) {
                char ch = input.charAt(i);
                stack.push(ch);
            }
            for (int i = length; i < input.length(); i++) {
                char currentCh = input.charAt(i);
                char currentToCompare = stack.pop();
                if (currentToCompare == '(' && currentCh == ')') {
                } else if (currentToCompare == '[' && currentCh == ']') {

                } else if (currentToCompare == '{' && currentCh == '}') {

                } else {
                    isTrue = true;
                    break;
                }
            }
        }
        if (isTrue) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
