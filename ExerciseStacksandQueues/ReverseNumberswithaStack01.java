package ExerciseStacksandQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberswithaStack01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i <numbers.length; i++) {
            int number = Integer.parseInt(numbers[i]);
            stack.push(number);
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " " );
        }
    }
}
