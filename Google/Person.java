package Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Company company;
    private List<Pokemon> pokemon;
    private List<Parents> parents;
    private List<Children> children;
    private Car car;


    public Person(){
        this.pokemon = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public Person(Company company, List<Pokemon> pokemon, List<Parents> parents, List<Children> children, Car car) {
        this.company = company;
        this.pokemon = pokemon;
        this.parents = parents;
        this.children = children;
        this.car = car;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    public List<Pokemon> getPokemon(){
        return this.pokemon;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Parents> getParents() {
        return this.parents;
    }

    public Company getCompany() {
        return company;
    }

    public List<Children> getChildren() {
        return children;
    }

    public Car getCar() {
        return car;
    }

    @Override
    public String toString() {
     StringBuilder sb = new StringBuilder();
        sb.append("Company:").append("\n");
        if (company != null){
            sb.append(company).append("\n");
        }
        sb.append("Car:").append("\n");
        if (car != null){
            sb.append(car).append("\n");
        }
        sb.append("Pokemon:").append("\n");
        for (Pokemon poke : pokemon) {
            sb.append(poke).append("\n");
        }
        sb.append("Parents:").append("\n");
        for (Parents parent : parents) {
            sb.append(parent).append("\n");
        }
        sb.append("Children:").append("\n");
        for (Children child : children) {
            sb.append(child).append("\n");
        }
        return sb.toString();
    }
}
