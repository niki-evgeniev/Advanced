package ExerciseSetsandMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsofElements02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] setSize = scanner.nextLine().split(" ");
        int firstSetSize = Integer.parseInt(setSize[0]);
        int secondSetSize = Integer.parseInt(setSize[1]);
        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        fillFirstSet(scanner, firstSetSize, firstSet);

        fillSecondSet(scanner, secondSetSize, secondSet);

        firstSet.retainAll(secondSet);

        printSet(firstSet);
    }

    private static void printSet(Set<Integer> firstSet) {
        for (Integer number : firstSet) {
            System.out.print(number + " ");
        }
    }

    private static void fillSecondSet(Scanner scanner, int secondSetSize, Set<Integer> secondSet) {
        for (int i = 0; i < secondSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            secondSet.add(number);
        }
    }

    private static void fillFirstSet(Scanner scanner, int firstSetSize, Set<Integer> firstSet) {
        for (int i = 0; i < firstSetSize; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            firstSet.add(number);
        }
    }
}
