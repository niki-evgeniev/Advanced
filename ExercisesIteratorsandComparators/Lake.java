package ExercisesIteratorsandComparators;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer> {
    private List<Integer> lake;

    public Lake(Integer... elements) {
        this.lake = List.of(elements);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Froggy();
    }

    class Froggy implements Iterator<Integer> {
        private int index = 0;
        private boolean firstRound = false;

        @Override
        public boolean hasNext() {
            return index < lake.size();
        }

        @Override
        public Integer next() {
            Integer element = lake.get(index);
            index += 2;
            if (index >= lake.size() && !firstRound) {
                index = 1;
                firstRound = true;
            }
            return element;
        }
    }
}
