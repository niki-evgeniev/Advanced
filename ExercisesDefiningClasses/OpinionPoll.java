package ExercisesDefiningClasses;

public class OpinionPoll {
    private String name;
    private int age;

    public OpinionPoll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public OpinionPoll() {

    }

    public void add(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s - %d", this.getName(), this.getAge());
    }

    public String getName(){
        return name;
    }


}
