package Pokemon;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//"{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}
        Map<String, Trainer> map = new LinkedHashMap<>();

        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("Tournament")) {

            String trainerName = input[0];
            String pokemonName = input[1];
            String element = input[2];
            int health = Integer.parseInt(input[3]);

            Pokemon pokemon = new Pokemon(pokemonName, element, health);

            map.putIfAbsent(trainerName, new Trainer());
            map.get(trainerName).addPokemon(pokemon);
            input = scanner.nextLine().split(" ");
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            for (Map.Entry<String, Trainer> kvp : map.entrySet()) {
                if (kvp.getValue().pokeCollectionSize() > 0) {
                    boolean havePokemon = false;
                    for (Pokemon pokemon : kvp.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(command)) {
                            havePokemon = true;
                            kvp.getValue().setNumOfBadges();
                            break;
                        }
                    }
                    if (!havePokemon) {
                        kvp.getValue().missingPokemonPenalty();
                    }
                }
            }
            command = scanner.nextLine();
        }
        map.entrySet().stream()
                .sorted((b1, b2) -> Integer.compare(b2.getValue().getNumOfBadges(), b1.getValue().getNumOfBadges()))
                .forEach(t -> {
                    System.out.println(String.format("%s %s %s", t.getKey(),
                            t.getValue().getNumOfBadges(),
                            t.getValue().pokeCollectionSize()));
                });
    }
}
