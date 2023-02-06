package Exam25June2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Double> milkQueue = new ArrayDeque<>();
        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();

        String[] data = scanner.nextLine().split(" ");
        for (int i = 0; i < data.length; i++) {
            milkQueue.offer(Double.parseDouble(data[i]));
        }
        data = scanner.nextLine().split(" ");

        Arrays.stream(data).map(Double::parseDouble).forEach(e -> cacaoStack.push(e));

        int milkChocolate = 0;       //30%
        int darkChocolate = 0;       //50%
        int bakingChocolate = 0;     //100%

        while (!cacaoStack.isEmpty()) {
            double milk = milkQueue.peek();
            double cacao = cacaoStack.peek();
            double sum = milk + cacao;
            double results = (cacao / sum) * 100;
            if (results == 100) {
                bakingChocolate++;
                milkQueue.poll();
                cacaoStack.pop();

            } else if (results == 50) {
                darkChocolate++;
                milkQueue.poll();
                cacaoStack.pop();
            } else if (results == 30) {
                milkChocolate++;
                milkQueue.poll();
                cacaoStack.pop();
            } else {
                cacaoStack.pop();
                double toIncrease = milkQueue.poll() + 10;
                milkQueue.offer(toIncrease);

            }
        }
        if (milkChocolate >= 1 && darkChocolate >= 1 && bakingChocolate >= 1) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }
        if (bakingChocolate > 0) {
            System.out.println("# Baking Chocolate --> " + bakingChocolate);
        }
        if (darkChocolate > 0) {
            System.out.println("# Dark Chocolate --> " + darkChocolate);
        }
        if (milkChocolate > 0) {
            System.out.println("# Milk Chocolate --> " + milkChocolate);
        }
    }
}
