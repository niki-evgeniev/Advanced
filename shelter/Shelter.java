package shelter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shelter {
    private int capacity;
    private List<Animal> data;

    public Shelter(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Animal animal) {
        if (data.size() < capacity) {
            data.add(animal);
        }
    }

    public boolean remove(String name) {
        for (Animal animal : data) {
            if (animal.getName().equals(name)) {
                data.remove(animal);
                return true;
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker) {
        for (Animal animal : data) {
            String namee = animal.getName();
            String car = animal.getCaretaker();
            if (namee.equals(name) && car.equals(caretaker)) {
                return animal;
            }
        }
        return null;
    }

    public Animal getOldestAnimal() {
        return Collections.max(data, (f, s) -> Integer.compare(f.getAge(), s.getAge()));
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The shelter has the following animals:");
        sb.append(System.lineSeparator());
        for (Animal animal : data) {
            sb.append(animal.getName()).append(" ").append(animal.getCaretaker());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

}
