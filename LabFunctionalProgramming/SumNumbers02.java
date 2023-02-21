package LabFunctionalProgramming;

import java.io.IOException;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        int count = input.length;

        Function<String[], Integer> sumOfNumber = s-> {
            int sum = 0;
            for (int i = 0; i < s.length; i++) {
                sum += Integer.parseInt(s[i]);
            }
            return sum;
        };

        System.out.println("Count = " + count);
        System.out.println("Sum = " + sumOfNumber.apply(input));
    }
}
