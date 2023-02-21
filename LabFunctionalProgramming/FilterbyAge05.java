package LabFunctionalProgramming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterbyAge05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mapGuest = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] users = scanner.nextLine().split(", ");
            mapGuest.put(users[0], Integer.parseInt(users[1]));
        }


        String parameter = scanner.nextLine();
        int ages = Integer.parseInt(scanner.nextLine());
        String whatToPrint = scanner.nextLine();
        int length = whatToPrint.length();

        printer(mapGuest, ages, parameter, length);
    }

    private static void printer(Map<String, Integer> mapGuest, int age, String parameter, int length) {

        if (parameter.equals("younger")) {

            younger(mapGuest, age, length);
        } else if (parameter.equals("older")) {

            older(mapGuest, age, length);
        }
    }

    private static void older(Map<String, Integer> mapGuest, int age, int length) {
        if (length == 3) {
            mapGuest.entrySet().stream().filter(entry -> entry.getValue() >= age).forEach(entry -> System.out.println(entry.getValue()));
        } else if (length == 4) {
            mapGuest.entrySet().stream().filter(entry -> entry.getValue() >= age).forEach(entry -> System.out.println(entry.getKey()));
        } else {
            mapGuest.entrySet().stream().filter(entry -> entry.getValue() >= age).forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        }
    }

    private static void younger(Map<String, Integer> mapGuest, int age, int length) {
        if (length == 3) {
            mapGuest.entrySet().stream().filter(entry -> entry.getValue() <= age).forEach(entry -> System.out.println(entry.getValue()));
        } else if (length == 4) {
            mapGuest.entrySet().stream().filter(entry -> entry.getValue() <= age).forEach(entry -> System.out.println(entry.getKey()));
        } else {
            mapGuest.entrySet().stream().filter(entry -> entry.getValue() <= age).forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
        }
    }


}
