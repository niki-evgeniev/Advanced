package Pokemon;

import java.util.Objects;

public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public Pokemon() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return health == pokemon.health && Objects.equals(name, pokemon.name) && Objects.equals(element, pokemon.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, element, health);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getElement() {
        return element;
    }

    public void lowerHealth() {
        this.health -= 10;
    }

    public int getHealth() {
        return health;
    }
}
