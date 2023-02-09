package ExerciseGenerics;

import java.util.Scanner;

public class MainBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();
        for (int i = 0; i < n; i++) {
            //Integer input = Integer.parseInt(scanner.nextLine());
            //String input = scanner.nextLine();
            Double input = Double.parseDouble(scanner.nextLine());
            box.add(input);
        }
//        String[] input = scanner.nextLine().split(" ");
//        int first = Integer.parseInt(input[0]);
//        int second = Integer.parseInt(input[1]);
//        box.swap(first, second);
        Double comand = Double.parseDouble(scanner.nextLine());
        int count = box.compare(comand);
        System.out.println(count);

    }
}
