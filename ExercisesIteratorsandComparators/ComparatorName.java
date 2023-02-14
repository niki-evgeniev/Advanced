package ExercisesIteratorsandComparators;

import java.util.Comparator;

public class ComparatorName implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        if (o1.getName().length() == o2.getName().length()){
            char firstPerson = o1.getName().toLowerCase().charAt(0);
            char secondPerson = o2.getName().toLowerCase().charAt(0);
            return Character.compare(firstPerson, secondPerson);
        }
        return o1.getName().length() - o2.getName().length();
    }
}
