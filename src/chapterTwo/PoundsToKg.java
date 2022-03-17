package chapterTwo;

import java.util.Scanner;

public class PoundsToKg{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter number in pounds: ");
    float pounds = input.nextFloat();

    float kg = pounds * 0.454F;

    System.out.printf("%.1f Pounds is %.3f Kilograms %n", pounds, kg);

    }

}
