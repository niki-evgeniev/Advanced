package examTest;

import java.util.ArrayDeque;
import java.util.Scanner;

public class OSPlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] deque = scanner.nextLine().split(", ");
        String[] queues = scanner.nextLine().split(" ");
        ArrayDeque<Integer> arrayStack = new ArrayDeque<>();
        ArrayDeque<Integer> arrayQueues = new ArrayDeque<>();

        for (int i = 0; i < deque.length; i++) {
            arrayStack.push(Integer.parseInt(deque[i]));
        }
        for (int i = 0; i < queues.length; i++) {
            arrayQueues.offer(Integer.parseInt(queues[i]));
        }
        int numberToKill = Integer.parseInt(scanner.nextLine());
        boolean isKilled = false;

        while (!isKilled) {
            int task = arrayStack.peek();
            int threads = arrayQueues.peek();
            if (numberToKill == task) {
                isKilled = true;
                System.out.printf("Thread with value %d killed task %d%n", threads, task);
            } else if (threads >= task) {
                arrayStack.pop();
                arrayQueues.poll();
            } else if (threads < task) {
                arrayQueues.poll();
            }
        }
        for (Integer arrayQueue : arrayQueues) {
            System.out.print(arrayQueue + " ");
        }
     }
}
