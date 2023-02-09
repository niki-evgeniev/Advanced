package ExerciseGenerics;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends  Comparable<T>>{
    private List<T> list;


    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }
    public void swap (int first, int second){
        T current = list.get(first);
        list.set(first, list.get(second));
        list.set(second, current);
    }
    public int compare (T compare){
        return (int )list.stream().
                filter(element -> element.compareTo(compare) > 0).
                count();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : list) {
            sb.append(String.format("%s: %s%n", element.getClass().getName(), element.toString()));
        }
        return sb.toString();
    }
}
