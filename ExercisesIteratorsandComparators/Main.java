package ExercisesIteratorsandComparators;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] commands = scanner.nextLine().split(" ");
        StackIterator stackIterator = new StackIterator();
        boolean isBreak = false;
        while (!commands[0].equals("END") && !isBreak) {

            Integer[] removeSymbol = new Integer[commands.length];

            switch (commands[0]) {
                case "Push":
                    removeSym(commands, removeSymbol);
                    Integer[] newData = new Integer[commands.length - 1];
                    System.arraycopy(removeSymbol, 1, newData, 0, removeSymbol.length - 1);
                    stackIterator.push(newData);
                    break;
                case "Pop":
                    if (stackIterator.isEmpty()){
                        isBreak = true;
                        continue;
                    }
                    stackIterator.pop();
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }
        if (stackIterator.isEmpty()) {
            System.out.println("No elements");
        } else {
            for (Integer integer : stackIterator) {
                System.out.println(integer);
            }
            for (Integer integer : stackIterator) {
                System.out.println(integer);
            }
        }

    }

    private static void removeSym(String[] commands, Integer[] removeSymbol) {
        for (int i = 1; i < commands.length; i++) {
            String number = commands[i].replaceAll(",", "");
            removeSymbol[i] = Integer.parseInt(number);
        }
    }
}
