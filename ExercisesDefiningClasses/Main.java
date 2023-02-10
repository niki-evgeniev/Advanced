package ExercisesDefiningClasses;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(" ");
        Map<String, List<Pokemon>> map = new LinkedHashMap<>();
        while (!data[0].equals("Tournament")) {
            //Peter Charizard Fire 100
            String nameTrainer = data[0];
            String pokemonName = data[1];
            String element = data[2];
            int hp = Integer.parseInt(data[3]);
            if (map.containsKey(nameTrainer)) {
                Pokemon pokemon = new Pokemon(pokemonName, element, hp);
                map.get(nameTrainer).add(pokemon);
            } else {
                Pokemon pokemon = new Pokemon(pokemonName, element, hp);
                map.putIfAbsent(nameTrainer, new ArrayList<>());
                map.get(nameTrainer).add(pokemon);
            }
            data = scanner.nextLine().split(" ");
        }
        String elements = scanner.nextLine();
        while (!elements.equals("End")) {
            //String finalElements = elements;
            for (Map.Entry<String, List<Pokemon>> entry : map.entrySet()) {
                for (Pokemon pokemon : entry.getValue()) {
                    if (pokemon.getPokemonElement().equals(elements)) {
                        int badges = pokemon.getBadges();
                        badges++;
                        pokemon.setBadges(badges);
                    } else {
                        int hp = pokemon.getHealth();
                        hp = hp - 10;
                        if (hp >= 0) {

                        }
                    }
                }
            }

            elements = scanner.nextLine();
        }
        System.out.println();
    }
}
