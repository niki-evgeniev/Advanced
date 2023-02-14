package ExerciseSetsandMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Map<String, String> mapEmail = new LinkedHashMap<>();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.contains(".us") && !email.contains(".uk") && !email.contains(".com") ){
                mapEmail.put(name, email);
            }
                name = scanner.nextLine();
        }

        printMap(mapEmail);
    }

    private static void printMap(Map<String, String> mapEmail) {
        for (Map.Entry<String, String> entry : mapEmail.entrySet()) {
            System.out.printf("%s -> %s%n",entry.getKey(), entry.getValue());
        }
    }
}
