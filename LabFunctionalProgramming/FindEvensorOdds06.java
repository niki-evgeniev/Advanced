package LabFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindEvensorOdds06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int startIndex = Integer.parseInt(input[0]);
        int endIndex = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<>();

        for (int i = startIndex; i <= endIndex; i++) {
            list.add(i);
        }
        String command = scanner.nextLine();
        if (command.equals("even")) {

            list.stream()
                    .filter(n -> n % 2 == 0)
                    .forEach(n -> System.out.print(n + " "));
        } else if (command.equals("odd")) {

            list.stream()
                    .filter(n -> n % 2 != 0)
                    .forEach(n -> System.out.print(n + " "));
        }
    }
}
