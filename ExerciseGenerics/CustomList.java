package ExerciseGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T remove(int element) {
        return list.remove(element);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public void swap(int first, int second) {
        T current = list.get(first);
        list.set(first, list.get(second));
        list.set(second, current);
        //Collections.swap(list, first, second);
    }

        public int countGreaterThan(T element) {
        return (int) list.stream()
                .filter(e -> e.compareTo(element) > 0)
                .count();
    }

    public T get(int index) {
        return list.get(index);
    }

    public T getMax() {
        return list.stream()
                .max(Comparable::compareTo).get();
    }

    public T getMin() {
        return list.stream()
                .min(Comparable::compareTo).get();
    }
    public void sort(){
        Collections.sort(list);

    }
//    public void sort(){
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = 1; j < (list.size() - i); j++) {
//                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
////                    list.swap(j - 1, j);
//                    Collections.swap(list, j - 1, j);
//                }
//            }
//        }
//    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : list) {
            //return String.format("%s%n",element.toString());
            sb.append(String.format("%s%n", element.toString()));
        }
        return sb.toString().trim();
    }
}
