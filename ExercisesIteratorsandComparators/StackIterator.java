package ExercisesIteratorsandComparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StackIterator implements Iterable<Integer> {
    private List<Integer> list;
    private int index;

    public StackIterator() {
        this.list = new ArrayList<>();
    }

    public void push(Integer[] numbers) {
        list = Arrays.asList(numbers);
        index = list.size();
    }

    public void pop() {
        if (index == 0) {
            index = 0;
        } else {
            index--;
        }

    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }


    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int currentIndex = index -1;

            @Override
            public boolean hasNext() {
                return currentIndex >= 0;
            }

            @Override
            public Integer next() {
                return list.get(currentIndex--);

            }
        };

    }
}

