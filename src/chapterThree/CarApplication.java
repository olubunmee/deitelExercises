package chapterThree;

import java.util.Scanner;

public class CarApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Car firstCar = new Car("BMW", "2010", 4_000_000);
        Car secondCar = new Car("Toyota", "2012", 2_300_000);

        System.out.printf("%s %s %f",firstCar.getModel(), firstCar.getYear(), firstCar.getPrice(0.0));
        System.out.println();
        System.out.printf("%s %s %f",secondCar.getModel(), secondCar.getYear(), secondCar.getPrice(0.0));
        System.out.println();

        System.out.println("New price of " + firstCar.getModel() + " " + firstCar.getYear() + " is " + firstCar.getPrice(0.05));
        System.out.println("New price of " + secondCar.getModel() + " " + secondCar.getYear() + " is " + secondCar.getPrice(0.07));


    }
}
