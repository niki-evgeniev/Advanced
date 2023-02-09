package ExerciseGenerics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            String commandSecond = "";
            int index = 0;
            switch (command) {
                case "Add":
                    commandSecond = commands[1];
                    customList.add(commandSecond);
                    break;
                case "Remove":
                    index = Integer.parseInt(commands[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    commandSecond = commands[1];
                    System.out.println(customList.contains(commandSecond));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(commands[1]);
                    int secondIndex = Integer.parseInt(commands[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    commandSecond = commands[1];
                    int count = customList.countGreaterThan(commandSecond);
                    System.out.println(customList.countGreaterThan(commandSecond));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case"Sort":
                    customList.sort();
                    break;
                case "Print":
                    System.out.println(customList);
                    break;

            }
            input = scanner.nextLine();
        }
    }
}
