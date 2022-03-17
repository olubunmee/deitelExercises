package chapterTwo;

import java.util.Scanner;

public class RunwayLength{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter starting speed v in m/s: ");
    float startingSpeed = input.nextFloat();

    System.out.print("Enter ending acceleration a in m/s2: ");
    float endingAcceleration = input.nextFloat();

    float length = (startingSpeed * startingSpeed) / (2 * endingAcceleration);

    System.out.printf("The minimum runway length for this airplane is %f%n", length);

    }

}
