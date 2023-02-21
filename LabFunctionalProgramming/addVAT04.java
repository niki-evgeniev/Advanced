package LabFunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class addVAT04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        List<Double> list = Arrays.stream(input).map(Double::parseDouble).collect(Collectors.toList());

        UnaryOperator<Double> unaryOperator = s -> s * 1.2;

        System.out.println("Prices with VAT:");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%.2f%n",unaryOperator.apply(list.get(i)));
        }
    }
}
