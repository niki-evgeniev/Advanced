package ExercisesDefiningClasses;

public class Pokemon {
    public String namePokemon;
    public String pokemonElement;
    public int health;
    public int badges;


    public Pokemon(String namePokemon, String pokemonElement, int health) {
        this.namePokemon = namePokemon;
        this.pokemonElement = pokemonElement;
        this.health = health;
        this.badges = 0;
    }

    public Pokemon() {

    }

    public void addName (String namePokemon, String pokemonElement, int health){
        this.namePokemon = namePokemon;
        this.pokemonElement = pokemonElement;
        this.health = health;
    }
    public int getHealth(){
        return this.health;
    }

    public String getNamePokemon(){
        return this.namePokemon;
    }
    public String getPokemonElement(){
        return this.pokemonElement;
    }
    public int getBadges(){
        return this.badges;
    }
    public void setBadges(int badges){
        this.badges = badges;
    }
    public void setPokemonElement (String element){
        this.pokemonElement = element;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public void removePokemon(String namePokemon){
        this.namePokemon = namePokemon;
    }
}
