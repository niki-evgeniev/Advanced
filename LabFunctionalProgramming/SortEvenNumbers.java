package LabFunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(", ");
        List<Integer> list = Arrays.stream(numbers).map(Integer::parseInt).filter(n-> n % 2 == 0).collect(Collectors.toList());
        list.removeIf(n -> n % 2 != 0);
        //list.stream().map(String::valueOf).forEach(n -> System.out.println(String.join(",",n)));
        System.out.println("" + String.join(",", list.toString().replaceAll("[\\[\\]\\]]","")));
        Collections.sort(list);
        System.out.println("" + String.join(",", list.toString().replaceAll("[\\[\\]\\]]","")));

        // System.out.println(String.join(", ", numbers));
    }
}
