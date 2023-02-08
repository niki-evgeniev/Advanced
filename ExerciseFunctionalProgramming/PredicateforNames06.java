package ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateforNames06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> listName = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Predicate<String> predicate = e -> e.length() <= n;
        //listName.removeIf(predicate);

        listName.stream().filter(predicate).forEach(System.out::println);
    }
}
