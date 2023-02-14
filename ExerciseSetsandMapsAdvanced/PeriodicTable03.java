package ExerciseSetsandMapsAdvanced;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> names = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] name = scanner.nextLine().split(" ");
            for (String inter : name) {
                names.add(inter);

            }
        }
        System.out.println(String.join(" ", names));
    }
}
