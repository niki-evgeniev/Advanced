package ExercisesIteratorsandComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        List<Person> personList = new ArrayList<>();

        while (!data[0].equals("END")) {
            Person personToAdd = new Person(data[0], Integer.parseInt(data[1]), data[2]);
            personList.add(personToAdd);
            data = scanner.nextLine().split(" ");
        }

        int personInCollection = Integer.parseInt(scanner.nextLine());
        int equalPeople = 0;
        int differentPeople = 0;

        Person person = personList.get(personInCollection -1);

        for (Person person1 : personList) {
            if (person1.equals(person)){
                equalPeople++;
            }else {
                differentPeople++;
            }
        }
        if (equalPeople == 1){
            System.out.println("No matches");
        }else {
            System.out.println(equalPeople + " " + differentPeople + " " + personList.size());
        }


    }
}
