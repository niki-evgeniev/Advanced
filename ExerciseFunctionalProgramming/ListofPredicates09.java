package ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListofPredicates09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> devisible = n -> {
            for (Integer numberToDivideTo : list) {
                if (n % numberToDivideTo != 0) {
                    return false;
                }
            }
            return true;
        };
        IntStream.rangeClosed(1, number).boxed().filter(devisible).forEach(n -> System.out.print(n + " "));
    }
}
