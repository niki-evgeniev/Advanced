package ExerciseSetsandMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] wordCount = scanner.nextLine().toCharArray();
        Map<Character, Integer> mapCounter = new TreeMap<>();

        for (int i = 0; i < wordCount.length; i++) {
            if (!mapCounter.containsKey(wordCount[i])) {
                mapCounter.put(wordCount[i], 1);
            } else {
                int current = mapCounter.get(wordCount[i]);
                mapCounter.put(wordCount[i], current + 1);
            }
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : mapCounter.entrySet()) {
            System.out.printf("%s: %d time/s%n", characterIntegerEntry.getKey(), characterIntegerEntry.getValue());
        }



    }
}


