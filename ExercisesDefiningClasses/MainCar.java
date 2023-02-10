package ExercisesDefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<OpinionPoll> listOpinionPoll = new ArrayList<>();
        //Car car = new Car();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            OpinionPoll opinionPoll = new OpinionPoll();
            opinionPoll.add(data[0], Integer.parseInt(data[1]));
            listOpinionPoll.add(opinionPoll);

        }
        listOpinionPoll.stream().filter(opinionPoll -> opinionPoll.getAge() > 30).
                sorted((left, right) -> left.getName().compareTo(right.getName()))
                .forEach(System.out::println);

    }
}
