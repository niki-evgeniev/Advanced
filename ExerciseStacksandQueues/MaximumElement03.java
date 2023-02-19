package ExerciseStacksandQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] operations = scanner.nextLine().split(" ");
            int commands = Integer.parseInt(operations[0]);

            switch (commands) {
                case 1: //- Push the element X into the stack
                    int number = Integer.parseInt(operations[1]);
                    stack.push(number);
                    break;
                case 2: //Delete the element present at the top of the stack.
                    stack.pop();
                    break;
                case 3: //Print the maximum element in the stack
                    System.out.println(Collections.max(stack));
                    break;
            }


        }
    }
}
