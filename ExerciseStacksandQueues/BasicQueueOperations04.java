package ExerciseStacksandQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] operation = scanner.nextLine().split(" ");

        int elementToAdd = Integer.parseInt(operation[0]);
        int elementToRemove = Integer.parseInt(operation[1]);
        int elementToCheck = Integer.parseInt(operation[2]);

        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque <Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < elementToAdd; i++) {
            queue.offer(Integer.parseInt(numbers[i]));
        }

        for (int i = 0; i < elementToRemove; i++) {
            queue.poll();
        }

        if (queue.isEmpty()){
            System.out.println(0);
        }else if (queue.contains(elementToCheck)){
            System.out.println("true");
        }else {
            System.out.println(Collections.min(queue));
        }
    }
}
