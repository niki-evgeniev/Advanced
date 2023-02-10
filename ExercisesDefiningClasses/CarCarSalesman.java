package ExercisesDefiningClasses;

public class CarCarSalesman {
    private String modelCar;
    private String engineCar;
    private String weightCar;
    private String colorCar;


    public CarCarSalesman(String modelCar, String engineCar, String weightCar, String colorCar) {
        this.modelCar = modelCar;
        this.engineCar = engineCar;
        this.weightCar = weightCar;
        this.colorCar = colorCar;
    }

    public CarCarSalesman(String modelCar, String engineCar) {
        this.modelCar = modelCar;
        this.engineCar = engineCar;
        this.weightCar = "n/a";
        this.colorCar = "n/a";
    }

    public CarCarSalesman(String modelCar, String engineCar, String parameter) {
        if (Character.isLetter(parameter.charAt(0))) {
            this.modelCar = modelCar;
            this.engineCar = engineCar;
            this.weightCar = "n/a";
            this.colorCar = parameter;
        } else {
            this.modelCar = modelCar;
            this.engineCar = engineCar;
            this.weightCar = parameter;
            this.colorCar = "n/a";
        }
    }

    public String getEngineCar() {
        return this.engineCar;
    }

    public String getModelCar() {
        return this.modelCar;
    }
    public String getWeightCar(){
        return this.weightCar;
    }
    public String getColorCar(){
        return this.colorCar;
    }

    @Override
    public String toString() {
        return String.format("%d%n", getModelCar());
    }
}
