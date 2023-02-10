package ExercisesDefiningClasses;

public class EngineCarSalesman {
    private String modelEngine;
    private String power;
    private String displacement;
    private String efficiency;

    public EngineCarSalesman(String modelEngine, String power, String displacement, String efficiency) {
        this.modelEngine = modelEngine;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public EngineCarSalesman(String modelEngine, String power, String parameter) {
        if (Character.isLetter(parameter.charAt(0))) {
            this.modelEngine = modelEngine;
            this.power = power;
            this.displacement = "n/a";
            this.efficiency = parameter;
        } else {
            this.modelEngine = modelEngine;
            this.power = power;
            this.displacement = parameter;
            this.efficiency = "n/a";
        }
    }

    public EngineCarSalesman(String modelEngine, String power) {
        this.modelEngine = modelEngine;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }
    public String getModelEngine(){
        return modelEngine;
    }
    public String getDisplacement(){
        return this.displacement;
    }
    public String getEfficiency(){
        return this.efficiency;
    }
    public String getPower(){
        return this.power;
    }
    @Override
    public String toString() {
        return String.format("%s%n", getModelEngine());
        //return String.format("%s%n", getEfficiency());

    }
}
