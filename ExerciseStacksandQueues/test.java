package ExerciseStacksandQueues;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<Character> stack = new ArrayDeque<>();
        boolean isTrue = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty()) {
                    isTrue = true;
                    break;
                }
                char firstChar = stack.pop();
                char lastChar = input.charAt(i);
                if (lastChar == ')' && firstChar == '(') {

                } else if (lastChar == ']' && firstChar == '[') {

                } else if (lastChar == '}' && firstChar == '{') {

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
