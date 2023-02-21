package sanctuary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Habitat {
    private int capacity;
    private List<Elephant> data;

    public Habitat(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Elephant elephant) {
        if (data.size() < capacity) {
            data.add(elephant);
        }
    }

    public boolean remove(String name) {
        for (Elephant elephant : data) {
            if (elephant.getName().equals(name)) {
                data.remove(elephant);
                return true;
            }
        }
        return false;
    }

    public Elephant getElephant(String retiredFrom) {
        for (Elephant elephant : data) {
            if (elephant.getRetiredFrom().equals(retiredFrom)) {
                return elephant;
            }
        }
        return null;
    }

    public Elephant getOldestElephant() {
        return Collections.max(data, (f, s) -> Integer.compare(f.getAge(), s.getAge()));
    }

    public int getAllElephants(){
        return data.size();
    }

    public String getReport(){
        StringBuilder sb = new StringBuilder();
       // sb.append(System.lineSeparator());
        sb.append("Saved elephants in the park:");
        sb.append(System.lineSeparator());
        for (Elephant elephant : data) {
            sb.append(elephant.getName()).append(" came from: ").append(elephant.getRetiredFrom());
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

}
