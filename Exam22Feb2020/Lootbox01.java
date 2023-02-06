package Exam22Feb2020;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lootbox01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> firstBoxQueue = new ArrayDeque<>();
        ArrayDeque<Integer> secondBoxStack = new ArrayDeque<>();

        String[] data = scanner.nextLine().split(" ");
        for (int i = 0; i < data.length; i++) {
            firstBoxQueue.offer(Integer.parseInt(data[i]));
        }
        data = scanner.nextLine().split(" ");
        for (int i = 0; i < data.length; i++) {
            secondBoxStack.push(Integer.parseInt(data[i]));
        }
        int sums = 0;
        boolean isEmpty = false;
        while (!isEmpty) {
            int a = firstBoxQueue.peek();
            int b = secondBoxStack.pop();
            int sum = a + b;
            if (sum % 2 == 0) {
                sums += sum;
                firstBoxQueue.poll();
            } else {
                firstBoxQueue.offer(b);
            }
            if (firstBoxQueue.isEmpty()) {
                isEmpty = true;
            }
            if (secondBoxStack.isEmpty()) {
                isEmpty = true;
            }
        }
        if (firstBoxQueue.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }
        if (sums >= 100){
            System.out.printf("Your loot was epic! Value: %d", sums);
        }else {
            System.out.printf("Your loot was poor... Value: %d", sums);
        }
    }
}
