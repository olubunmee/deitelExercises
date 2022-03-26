package chapterTwo;

import java.util.Scanner;

public class Years{

    public static void main(String[] args){

    Scanner input = new Scanner(System.in); 

    System.out.print("Enter minutes: ");
    long minutes = input.nextLong();

    long years = minutes / 1440 / 365;

    long days = minutes / 1440 % 365;

    System.out.printf("%d minutes is approximately %d years and %d days %n", minutes,years,days);   
   
    }
}
