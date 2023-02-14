package ExerciseSetsandMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] namePhone = scanner.nextLine().split("\\-");
        Map<String, String> mapPhonebook = new LinkedHashMap<>();

        while (!namePhone[0].equals("search")) {
            String name = namePhone[0];
            String phone = namePhone[1];
            mapPhonebook.put(name, phone);
            namePhone = scanner.nextLine().split("\\-");
        }

        String commands = scanner.nextLine();
        while (!commands.equals("stop")){
            if (mapPhonebook.containsKey(commands)){
                String phone = mapPhonebook.get(commands);
                System.out.printf("%s -> %s%n",commands, phone);
                }else {
                System.out.printf("Contact %s does not exist.%n", commands);
            }
            commands = scanner.nextLine();
        }
    }
}
