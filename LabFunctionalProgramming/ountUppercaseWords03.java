package LabFunctionalProgramming;

import java.util.*;
import java.util.function.Predicate;

public class ountUppercaseWords03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<String> list = new ArrayList<>();

        Predicate<String> predicate = s -> Character.isUpperCase(s.charAt(0));

        for (int i = 0; i < input.length; i++) {
            if(predicate.test(input[i])){
                list.add(input[i]);
            }
        }

        System.out.println(list.size());
        list.forEach(System.out::println);

    }
}
