package ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetic04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumber = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        UnaryOperator<List<Integer>> addNumber = n -> n.stream().map(number -> number + 1).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyNumber = n -> n.stream().map(number -> number *2).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractNumber = n -> n.stream().map(number -> number -1 ).collect(Collectors.toList());
        Consumer<List<Integer>> print = n -> n.forEach(number -> System.out.print(number + " "));

        String input = scanner.nextLine();
        while (!input.equals("end")){
            switch (input){
                case "add":
                    listNumber = addNumber.apply(listNumber);
                    break;
                case"multiply":
                    listNumber = multiplyNumber.apply(listNumber);
                    break;
                case"subtract":
                    listNumber = subtractNumber.apply(listNumber);
                    break;
                case "print":
//                    for (int number : listNumber) {
//                        System.out.print(number + " ");
//                    }
//                    System.out.println();
                    print.accept(listNumber);
                    System.out.println();
                    break;
            }
            input = scanner.nextLine();
        }

    }
}
