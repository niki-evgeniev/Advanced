package ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseandExclude05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumber = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int number = Integer.parseInt(scanner.nextLine());
        Collections.reverse(listNumber);

        Predicate<Integer> num = n -> n % number == 0;
        listNumber.removeIf(num);

        listNumber.forEach(e -> System.out.print(e + " "));

    }
}
