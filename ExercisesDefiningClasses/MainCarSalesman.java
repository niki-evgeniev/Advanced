package ExercisesDefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCarSalesman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<EngineCarSalesman> listEngineCarSalesman = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String modelEngine= data[0];
            String powerEngine = data[1];
            String displacement;
            String efficiency;
            if (data.length == 2) {
                EngineCarSalesman engineCarSalesman = new EngineCarSalesman(modelEngine, powerEngine);
                listEngineCarSalesman.add(engineCarSalesman);
            } else if (data.length == 3) {
                displacement = data[2];
                EngineCarSalesman engineCarSalesman = new EngineCarSalesman(modelEngine, powerEngine, displacement);
                listEngineCarSalesman.add(engineCarSalesman);
            } else if (data.length == 4) {
                displacement = data[2];
                efficiency = data[3];
                EngineCarSalesman engineCarSalesman = new EngineCarSalesman(modelEngine, powerEngine, displacement, efficiency);
                listEngineCarSalesman.add(engineCarSalesman);
            }
        }

        n = Integer.parseInt(scanner.nextLine());
        List<CarCarSalesman> listCarCarSalesman = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String modelCar = data[0];
            String powerCar = data[1];
            String weightCar;
            String colorCar;
            if (data.length == 2) {
                CarCarSalesman carCarSalesman = new CarCarSalesman(modelCar, powerCar);
                listCarCarSalesman.add(carCarSalesman);
            } else if (data.length == 3) {
                weightCar = data[2];
                CarCarSalesman carCarSalesman = new CarCarSalesman(modelCar, powerCar, weightCar);
                listCarCarSalesman.add(carCarSalesman);
            } else if (data.length == 4) {
                weightCar = data[2];
                colorCar = data[3];
                CarCarSalesman carCarSalesman = new CarCarSalesman(modelCar, powerCar, weightCar, colorCar);
                listCarCarSalesman.add(carCarSalesman);
            }
        }

        for (CarCarSalesman carCarSalesman : listCarCarSalesman) {
            for (EngineCarSalesman engineCarSalesman : listEngineCarSalesman) {
                if (carCarSalesman.getEngineCar().equals(engineCarSalesman.getModelEngine())){
                    System.out.println(carCarSalesman.getModelCar() + ":");
                    System.out.println(engineCarSalesman.getModelEngine()+ ":");
                    System.out.printf("Power: %s%n", engineCarSalesman.getPower());
                    System.out.printf("Displacement: %s%n", engineCarSalesman.getDisplacement());
                    System.out.printf("Efficiency: %s%n", engineCarSalesman.getEfficiency());
                    System.out.printf("Weight: %s%n", carCarSalesman.getWeightCar());
                    System.out.printf("Color: %s%n", carCarSalesman.getColorCar());


                }
            }
        }
    }
}
