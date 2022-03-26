package chapterTwo;

import java.util.Scanner;

public class TwoPointThreeThree{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter weight in kg: ");
    float weight = input.nextFloat();

    System.out.print("Enter height in meters: ");
    float height = input.nextFloat();

    float bmi = weight / (height * height);

    System.out.printf("BMI is %f%n", bmi);

        System.out.println("Underweight: < 18.5");
        System.out.println("Normal: 18.5 - 24.9");
        System.out.println("Overweight: 25 - 29.9");
        System.out.println("Obese: 30 >");


    }

}
