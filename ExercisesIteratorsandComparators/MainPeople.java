package ExercisesIteratorsandComparators;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainPeople {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<People> setName = new TreeSet<>(new ComparatorName());
        Set<People> setAge = new TreeSet<>(new ComparatorAge());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            People people = new People(name, age);

            setAge.add(people);
            setName.add(people);
        }
        for (People people : setName) {
            System.out.println(people.toString());
        }
        for (People people : setAge) {
            System.out.println(people.toString());
        }
    }
}
