package DefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Car car = new Car();

//        car.brand = "Chevrolet";
//        car.model = "Impala";
//        car.power = 390;
//        car.setBrand("Chevrolet");
//        car.setModel("Impala");
//        car.setPower(390);

//        System.out.printf("The car is %s %s - %d HP", car.brand, car.model, car.power);
//        System.out.printf("The car is %s %s - %d HP", car.getBrand(), car.getModel(), car.getPower());
//        System.out.println(car.toString());


        //////////////////////////////////////////  //////////////////////////////////////////
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> listCar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            if (input.length == 1) {
                Car car = new Car(input[0]);
                listCar.add(car);
            } else if (input.length == 2) {
                if (!Character.isLetter(input[1].charAt(0))) {
                    Car car = new Car(input[0], Integer.parseInt(input[1]));
                    listCar.add(car);
                } else {
                    Car car = new Car(input[0], input[1]);
                    listCar.add(car);
                }
            } else {
                Car car = new Car(input[0], input[1], Integer.parseInt(input[2]));
                listCar.add(car);
            }

        }
        for (Car car : listCar) {
            System.out.println(car);
        }
    }
}
