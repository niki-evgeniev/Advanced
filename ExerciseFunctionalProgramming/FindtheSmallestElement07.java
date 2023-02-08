package ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindtheSmallestElement07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        Function<List<Integer>, Integer> function = e -> {
            int minNumber = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < e.size(); i++) {
                if (e.get(i) <= minNumber){
                    minNumber = e.get(i);
                    index = i;
                }
            }
            return index;
        };
        System.out.println(function.apply(list));



    }
}
