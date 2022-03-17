package chapterTwo;

import java.util.Scanner;

public class Acceleration{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter initial velocity, v0: ");
    float initialVelocity = input.nextFloat();

    System.out.print("Enter final velocity, v1: ");
    float finalVelocity = input.nextFloat();

    System.out.print("Enter time span t in seconds: ");
    float time = input.nextFloat();

    float averageAcceleration = (finalVelocity - initialVelocity) / time;

    System.out.printf("The average acceleration is %f%n", averageAcceleration);



    }





}
