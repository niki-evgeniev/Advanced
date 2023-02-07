package exam28june2020.parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Parking {
    private String type;
    private int capacity;
    private List<Car> data;

    public Parking(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (data.size()  < capacity) {
            data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model) {
        for (Car car : data) {
            String manufac = car.getManufacturer();
            String modl = car.getModel();
            if (manufac.equals(manufacturer) && modl.equals(model)) {
                data.remove(car);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        if (data.isEmpty()){
            return null;
        }else {
            return Collections.max(data, Comparator.comparingInt(Car::getYear));
        }
    }

    public Car getCar(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("The cars are parked in Underground exam28june2020.parking garage:");
        sb.append(System.lineSeparator());
        for (Car car : data) {
            sb.append(car);
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

}
