package chapterTwo;

import java.util.Scanner;

public class FeetToMeters{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number in feet: ");
    float feet = input.nextFloat();

    float meters = feet * 0.305F;

    System.out.printf("%.1f feet is %.4f meters%n", feet, meters);

    }

}
