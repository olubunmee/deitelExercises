package chapterTwo;

import java.util.Scanner;

public class Energy{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter weight of water in kg: ");
    float weight = input.nextFloat();

    System.out.print("Enter initial temperature in celsius: ");
    float initialTemperature = input.nextFloat();

    System.out.print("Enter final temperature in celsius: ");
    float finalTemperature = input.nextFloat();

    float energy = weight * (finalTemperature - initialTemperature) * 4184;

    System.out.printf("The energy needed is %f%n", energy);


    }        


}
