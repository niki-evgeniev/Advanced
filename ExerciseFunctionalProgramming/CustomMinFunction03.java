package ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Function<int[], Integer> function = e -> {
            int minValue = Integer.MAX_VALUE;
            for (int number : e) {
                if (minValue > number){
                    minValue = number;
                }
            }
            return minValue;
        };
        int minValue = function.apply(numbers);
        System.out.println(minValue);
    }
}
