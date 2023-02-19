package Google;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        Map<String, Person> map = new LinkedHashMap<>();
        while (!data[0].equals("End")){
            String name = data[0];
            String commands = data[1];
            if (!map.containsKey(name)){
                map.put(name,new Person());
            }
            switch (commands){
                case"company":
                Company company = new Company(data[2], data[3], Double.parseDouble(data[4]));
                map.get(name).setCompany(company);
                    break;
                case"pokemon":
                    Pokemon pokemon = new Pokemon(data[2], data[3]);
                    map.get(name).getPokemon().add(pokemon);
                    break;
                case"parents":
                    Parents parents = new Parents(data[2], data[3]);
                    map.get(name).getParents().add(parents);
                    break;
                case"children":
                    Children children = new Children(data[2], data[3]);
                    map.get(name).getChildren().add(children);
                    break;
                case"car":
                    Car car = new Car(data[2], Integer.parseInt(data[3]));
                    map.get(name).setCar(car);
                    break;
            }

            data = scanner.nextLine().split(" ");
        }
        String namePrint = scanner.nextLine();

        System.out.println(namePrint);
        Person persontPrint = map.get(namePrint);
        System.out.println(persontPrint);

    }
}
