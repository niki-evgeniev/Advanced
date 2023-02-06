package Exam20February2021;

import java.lang.reflect.Array;
import java.util.*;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> firstQueue = new ArrayDeque<>();
        ArrayDeque<Integer> secondStack = new ArrayDeque<>();
        List<Integer> collection = new ArrayList<>();

        String input = scanner.nextLine();

        Arrays.stream(input.split(" ")).map(Integer::parseInt)
                .forEach(firstQueue::offer);
        input = scanner.nextLine();
        Arrays.stream(input.split(" ")).map(Integer::parseInt)
                .forEach(secondStack::push);


        boolean isValid = false;
        while (!isValid) {
            int first = firstQueue.peek();
            int second = secondStack.pop();
            int sum = first + second;
            if (sum % 2 == 0) {
                collection.add(sum);
                firstQueue.poll();
                //secondStack.pop();
            } else {
                firstQueue.offer(second);
            }
            if (firstQueue.isEmpty()|| secondStack.isEmpty()){
                isValid = true;
            }
        }
        if (firstQueue.isEmpty()){
            System.out.println("First magic box is empty.");
        }else if (secondStack.isEmpty()){
            System.out.println("Second magic box is empty.");
        }

        int sum = 0;
        for (Integer number : collection) {
            sum += number;
        }
        if (sum >= 90){
            System.out.println("Wow, your prey was epic! Value: " + sum);
        }else {
            System.out.println("Poor prey... Value: " + sum);
        }

    }
}
