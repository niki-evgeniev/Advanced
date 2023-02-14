package ExercisesIteratorsandComparators;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ListyIterator implements Iterable<String> {

    private class LibIterator implements Iterator<String> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public String next() {
            return list.get(index++);
        }
    }

    private List<String> list;
    private int currentIndex;

    public ListyIterator() {
        this.list = new ArrayList<>();
    }

    public void create(String... name) {
        this.list = Arrays.asList(name);
    }

    public boolean move() {
        int sizeList = list.size();
        if (currentIndex < list.size() - 1) {
            currentIndex++;
            return true;
        }
        return false;
    }

    public boolean HasNext() {
        int hasNext = currentIndex + 1;
        int sizeList = list.size() - 1;
        if (currentIndex + 1 < list.size()) {
            return true;
        }
        return false;
    }

    public String Print() {
        if (list.isEmpty()) {
            return String.valueOf("Invalid Operation!");
        } else {
            return String.valueOf(list.get(currentIndex));
        }
    }

    public String PrintAll() {
        String allElements = "";
        for (String s : list) {
            allElements += s + " ";
        }
        return allElements;
    }

    @Override
    public Iterator<String> iterator() {
        return new LibIterator();
    }


}
