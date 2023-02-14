package ExerciseSetsandMapsAdvanced;

import java.util.*;

public class HandsOfCards07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] name = scanner.nextLine().split("\\: ");
        Map<String, Set<String>> mapCards = new LinkedHashMap<>();

        while (!name[0].equals("JOKER")) {
            String[] cards = name[1].split(", ");
            String namePlayer = name[0];
            if (!mapCards.containsKey(name[0])) {
                mapCards.put(name[0], new LinkedHashSet<>());
                for (String s : cards) {
                    mapCards.get(name[0]).add(s);
                }
            } else {
                for (String s : cards) {
                    mapCards.get(name[0]).add(s);
                }
            }
            name = scanner.nextLine().split("\\: ");
        }
        printMap(mapCards);
    }

    private static void printMap(Map<String, Set<String>> mapCards) {
        for (Map.Entry<String, Set<String>> entry : mapCards.entrySet()) {
            String namePlayer = entry.getKey();
            int totalSum = calculateCards(entry);
            System.out.printf("%s: %d%n", namePlayer, totalSum);
        }
    }

    private static int calculateCards(Map.Entry<String, Set<String>> entry) {
        int sum = 0;
        for (String n : entry.getValue()) {
            String cards = n;
            int sumTotalCard = 0;
            char[] charSymbol = cards.toCharArray();

            String symbol = String.valueOf(charSymbol[charSymbol.length - 1]); //color of cards
            String cardInfo = String.valueOf(charSymbol[charSymbol.length - 2]); // cards
            int testingSum = multiplyColor(symbol) * cardsSum(cardInfo);
            sum += testingSum;
        }
        return sum;
    }

    private static int multiplyColor(String symbol) {
        switch (symbol) {
            //(S -> 4, H-> 3, D -> 2, C -> 1).
            case "S":
                return 4;
            case "H":
                return 3;
            case "D":
                return 2;
            case "C":
                return 1;

        }
        return 0;
    }

    private static int cardsSum(String cardInfo) {
        switch (cardInfo) {
            case "0":
                return 10;
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "J":
                return 11;
            case "Q":
                return 12;
            case "K":
                return 13;
            case "A":
                return 14;

        }
        return 0;
    }
}

