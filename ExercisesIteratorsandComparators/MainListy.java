package ExercisesIteratorsandComparators;

import java.util.Scanner;

public class MainListy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String commands = scanner.nextLine();
        ListyIterator listyIterator = new ListyIterator();
        while (!commands.equals("END")) {
            String[] data = commands.split(" ");

            switch (data[0]) {
                case "Create":
                    String[] newData = new String[data.length - 1];
//                    for (int i = 1; i < data.length; i++) {
//                        newData[i -1] = data[i];
//                    }
                    System.arraycopy(data, 1, newData, 0, data.length - 1);
                    listyIterator.create(newData);

                    break;
                case "Move":
                    System.out.println(listyIterator.move());
                    break;
                case "HasNext":
                    System.out.println(listyIterator.HasNext());
                    break;
                case "Print":
                    System.out.println(listyIterator.Print());
                    break;
                case"PrintAll":
                    System.out.println(listyIterator.PrintAll());
                    break;
            }
            commands = scanner.nextLine();
        }
    }
}
