package DefiningClasses;

public class Car {
    private String brand;
    private String bow;
    private String model;
    private int power;

    public Car(String brand, String model, int power) {
        this.brand = brand;
        this.model = model;
        this.power = power;
    }

    public Car(String brand, int power) {
        this(brand, "unknown", power);
    }
    public Car(String brand){
        this(brand, "unknown", -1);
    }
    public Car (String brand, String model){
        this(brand, model, -1);
    }


    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getPower() {
        return this.power;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String toString() {
        return String.format("The car is: %s %s - %d HP."
                , this.brand, this.model, this.power);
    }
}
