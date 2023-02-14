package ExercisesDefiningClasses;

public class RawData {
    private String carModel;
    private int engineSpeed;
    private int enginePower;
    private int cargoWeight;
    private String cargoType;
    private double tire1;
    private int tire1Age;
    private double tire2;
    private int tire2Age;
    private double tire3;
    private int tire3Age;
    private double tire4;
    private int tire4Age;


    public RawData(String carModel, int engineSpeed, int enginePower, int cargoWeight, String cargoType) {
        this.carModel = carModel;
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }


    public RawData(String carModel, int engineSpeed, int enginePower, int cargoWeight, String cargoType,
                   double tire1, int tire1Age, double tire2, int tire2Age, double tire3, int tire3Age, double tire4, int tire4Age) {
        this(carModel, engineSpeed, enginePower, cargoWeight, cargoType);
        this.tire1 = tire1;
        this.tire1Age = tire1Age;
        this.tire2 = tire2;
        this.tire2Age = tire2Age;
        this.tire3 = tire3;
        this.tire3Age = tire3Age;
        this.tire4 = tire4;
        this.tire4Age = tire4Age;
    }

    public double getTire1 (){
        return this.tire1;
    }
    public double getTire2(){
        return this.tire2;
    }
    public double getTire3(){
        return this.tire3;
    }
    public double getTire4(){
        return this.tire4;
    }
    public String getCargoType(){
        return this.cargoType;
    }
    public String getCarModel(){
        return this.carModel;
    }
    public int getEnginePower(){
        return this.enginePower;
    }




    @Override
    public String toString() {
        return String.format("%s", this.carModel);
    }
}
