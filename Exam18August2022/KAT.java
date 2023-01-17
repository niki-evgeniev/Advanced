package Exam18August2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        ArrayDeque<Long> licenseQueue = new ArrayDeque<>();
        ArrayDeque<Long> carStack = new ArrayDeque<>();

        Arrays.stream(input).map(Long::parseLong).forEach(e -> licenseQueue.offer(e));
        input = scanner.nextLine().split(", ");
        Arrays.stream(input).map(Long::parseLong).forEach(e -> carStack.push(e));


        boolean isEndCars = false;
        long registredCar = 0;
        long countDays = 0;

        while (!isEndCars){
            long license = licenseQueue.poll();
            long car = carStack.pop();
            long howManyCarRegister = license / 2;

            if(howManyCarRegister > car){
                long licencseLeft = howManyCarRegister - car;
                registredCar += car;
                licencseLeft = licencseLeft * 2;
                licenseQueue.addLast(licencseLeft);

            }else if (howManyCarRegister < car){
                long carLeftforRegistration = car - howManyCarRegister;
                carStack.addLast( carLeftforRegistration);
                registredCar += howManyCarRegister;
            }else {
                registredCar += howManyCarRegister;
            }
            if (licenseQueue.isEmpty() || carStack.isEmpty()){
                isEndCars = true;
            }
            countDays++;

        }
        System.out.printf("%d cars were registered for %d days!%n", registredCar,countDays);
        if (!licenseQueue.isEmpty()){
            long countLicense = 0;
            for (Long license : licenseQueue) {
                countLicense += license;
            }
            System.out.printf("%d license plates remain!%n", countLicense);
        }else if (!carStack.isEmpty()){
            long countCar = 0;
            for (Long car : carStack) {
                countCar += car;
            }
            System.out.printf("%d cars remain without license plates!%n", countCar);
        }else {
            System.out.println("Good job! There is no queue in front of the KAT!");
        }

    }
}
