package ExerciseStacksandQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(" ");

        int pushElements = Integer.parseInt(commands[0]);
        int popElements = Integer.parseInt(commands[1]);
        int presentElements = Integer.parseInt(commands[2]);

        String[] numberToAdd = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < pushElements; i++) {
            stack.push(Integer.parseInt(numberToAdd[i]));
        }

        for (int i = 0; i < popElements; i++) {
            stack.pop();
        }

        if (stack.isEmpty()){
            System.out.println(0);
        }else if (stack.contains(presentElements)){
            System.out.println("true");
        }else {
            System.out.println(Collections.min(stack));
        }
    }
}
