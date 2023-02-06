package Exam20February2021.dealership;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealership {
    public  String name;
    public int capacity;
    public List<Car> data;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car) {
        if (data.size() < capacity) {
            data.add(car);
        }
    }

    public boolean buy(String manufacturer, String model) {
        for (Car car : data) {
            if (car.getManufacturer().equals(manufacturer) && car.getModel().equals(model)) {
                data.remove(car);
                return true;
            }
        }
        return false;
    }

    public Car getLatestCar() {
        if (data.isEmpty()) {
            return null;
        } else {
           return Collections.max(data, (f, s) -> Integer.compare(f.getYear(), s.getYear()));

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
        sb.append("The cars are in a car Exam20February2021.dealership " + name + ":");
        sb.append(System.lineSeparator());
        for (Car car : data) {
            sb.append(car);
            sb.append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

}
