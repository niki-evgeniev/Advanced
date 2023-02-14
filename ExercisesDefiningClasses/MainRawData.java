package ExercisesDefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRawData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<ExercisesDefiningClasses.RawData> listRawData = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String carModel = data[0];
            int speed = Integer.parseInt(data[1]);
            int power = Integer.parseInt(data[2]);
            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];
            double tire1Pressure = Double.parseDouble(data[5]);
            int tireAge1 = Integer.parseInt(data[6]);
            double tire2Pressure = Double.parseDouble(data[7]);
            int tireAge2 = Integer.parseInt(data[8]);
            double tire3Pressure = Double.parseDouble(data[9]);
            int tireAge3 = Integer.parseInt(data[10]);
            double tire4Pressure = Double.parseDouble(data[11]);
            int tireAge4 = Integer.parseInt(data[12]);

            RawData rawData = new RawData(carModel, speed, power, cargoWeight, cargoType,
                    tire1Pressure,tireAge1, tire2Pressure, tireAge2,
                    tire3Pressure, tireAge3, tire4Pressure, tireAge4);
            listRawData.add(rawData);
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")){
            for (RawData rawData : listRawData) {
                if (rawData.getTire1()< 1 || rawData.getTire2() < 1 || rawData.getTire3() < 1 || rawData.getTire4() < 1){
                    if (rawData.getCargoType().equals("fragile")){
                        System.out.println(rawData);
                    }
                }
            }
        }else if (command.equals("flamable")){
            for (RawData rawData : listRawData) {
                if (rawData.getCargoType().equals("flamable") && rawData.getEnginePower() > 250){
                    System.out.println(rawData);
                }
            }
        }

    }
}
