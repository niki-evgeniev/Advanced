package ExerciseSetsandMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        String test1 = "aaa";
        String test2 = "aaa";
        String test3 = "aaa";
        Set<String> setTest = new LinkedHashSet<>();
        setTest.add(test1);
        setTest.add(test2);
        setTest.add(test3);
        System.out.println();

    }

    private static int extracted(int aaa, int bbb) {
        int sum = aaa + bbb;
        return sum;
    }
}
