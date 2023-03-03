package workout;

import java.util.*;

public class Workout {
    private String type;
    private int exerciseCount;
    private List<Exercise> exercises;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < exerciseCount) {
            exercises.add(exercise);
        }
    }

    public boolean removeExercise(String name, String muscle) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                exercises.remove(exercise);
                return true;
            }
        }
        return false;
    }

    public Exercise getExercise(String name, String muscle) {
        for (Exercise exercise : exercises) {
            if (exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)) {
                return exercise;
            }
        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        if (exercises.isEmpty()) {
            return null;
        } else {
            return Collections.max(exercises, (f, s) -> Integer.compare(f.getBurnedCalories(), s.getBurnedCalories()));
        }
    }
    public int getExerciseCount(){
        return exercises.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("Workout type: " + type);
        sb.append(System.lineSeparator());
        for (Exercise exercise : exercises) {
            sb.append(exercise);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

}
