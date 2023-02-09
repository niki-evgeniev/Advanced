package ExerciseFunctionalProgramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PredicateParty10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listPeople = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("Party!")) {
            String[] commands = input.split(" ");
            String removeOrDouble = commands[0];
            String command = commands[1];
            String parameter = commands[2];

            Predicate<String> isValidStart = s -> s.startsWith(parameter);
            Predicate<String> isValidEndsWith = s -> s.endsWith(parameter);
            Predicate<String> isValidLength = s -> s.length() == Integer.parseInt(parameter);
            if (removeOrDouble.equals("Remove")) {

                switchRemove(listPeople, command, isValidStart, isValidEndsWith, isValidLength);

            } else if (removeOrDouble.equals("Double")) {
                int sizeList = listPeople.size();

                switchDouble(listPeople, command, isValidStart, isValidEndsWith, isValidLength, sizeList);
            }
            input = scanner.nextLine();

        }
        Collections.sort(listPeople);
        if (listPeople.isEmpty()){
            System.out.println("Nobody is going to the party!");
        }else {
            System.out.print(String.join(", ", listPeople));
            System.out.println(" are going to the party!");
        }
    }





    private static void switchDouble(List<String> listPeople, String command, Predicate<String> isValidStart, Predicate<String> isValidEndsWith, Predicate<String> isValidLength, int sizeList) {
        switch (command) {
            case "StartsWith":

                for (int i = 0; i < sizeList; i++) {
                    if (isValidStart.test(listPeople.get(i))) {
                        listPeople.add(listPeople.get(i));
                    }
                }
                break;
            case "EndsWith":
                for (int i = 0; i < sizeList; i++) {
                    if (isValidEndsWith.test(listPeople.get(i))) {
                        listPeople.add(listPeople.get(i));
                    }
                }
                break;
            case "Length":
                for (int i = 0; i < sizeList; i++) {
                    if (isValidLength.test(listPeople.get(i))) {
                        listPeople.add(listPeople.get(i));
                    }
                }
                break;
        }
    }

    private static void switchRemove(List<String> listPeople, String command, Predicate<String> isValidStart, Predicate<String> isValidEndsWith, Predicate<String> isValidLength) {
        switch (command) {
            case "StartsWith":
                listPeople.removeIf(isValidStart);
                break;
            case "EndsWith":
                listPeople.removeIf(isValidEndsWith);
                break;
            case "Length":
                listPeople.removeIf(isValidLength);
                break;
        }
    }
}
